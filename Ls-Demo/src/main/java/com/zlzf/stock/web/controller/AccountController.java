package com.zlzf.stock.web.controller;

import javax.enterprise.inject.New;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ylink.ylpay.common.project.account.exception.AccountCheckedException;
import com.ylink.ylpay.common.project.mp.app.EnterpriseAppService;
import com.ylink.ylpay.common.project.mp.dto.Enterprise;
import com.ylink.ylpay.common.project.stock.app.RoleAppService;
import com.zlzf.stock.common.exception.StockBusinessException;
import com.zlzf.stock.common.utils.DateUtil;
import com.zlzf.stock.common.utils.SessionManager;
import com.zlzf.stock.common.utils.StringUtil;
import com.zlzf.stock.model.entity.Order;
import com.zlzf.stock.model.entity.Role;
import com.zlzf.stock.model.entity.User;
import com.zlzf.stock.service.AccountService;
import com.zlzf.stock.service.OrderService;
import com.zlzf.stock.service.RoleService;

@Controller
@RequestMapping("/account")
public class AccountController  extends AbstractStockController{ //继承抽象类

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Qualifier("accountServer")
	private AccountService accountService;

	@Autowired
	@Qualifier("sessionManager")
	private SessionManager sessionManager;

	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	
	@Autowired
	@Qualifier("roleService")
	private RoleService roleService;
	
	@Autowired
	@Qualifier("enterpriseAppService")
	private EnterpriseAppService enterpriseAppService;

	@RequestMapping(value = "/findcingAcInfo",method = RequestMethod.GET)
	public ModelAndView findcingAcInfo(HttpServletRequest request,Model model,HttpServletResponse response) {
		logger.info("跳转账户信息页");
		logger.info("请求参数:无");
		ModelAndView view = new ModelAndView("error");
		try {
			User user = sessionManager.getCurrUser();
			String organizationId = user.getOrganizationId();
			String proleName = user.getRoleList().get(0).getParentName();
			String custId = user.getEnterpriseId();
			String custName = user.getEnterpriseName();
			String accountAmt = accountService.queryAccountBalance(custId,organizationId)+"";//查询余额
			
			//根据年份 企业id 圈子 查询年收入订单
			String year = DateUtil.getCurrentPrettyYear();
			Order incomrAmtInfor = orderService.findYearIncomeAmt(year,user.getEnterpriseId(),organizationId);
			view.addObject("incomeAmt", "0");
			if (null != incomrAmtInfor) {
				view.addObject("yearIncomeAmt", incomrAmtInfor.getOrderAmt());
			}
			//根据年份 企业id 圈子 查询 年支出金额
			Order yearPayInfo =	orderService.findYearPayAmt(year,user.getEnterpriseId(),organizationId);
			view.addObject("yearPayInfo", "0");
			if (null != yearPayInfo) {
				view.addObject("yearPayInfo", yearPayInfo.getOrderAmt());
			}
			Role role = roleService.findById(user.getEnterpriseId());
			if (role != null && "".equals(role.getToken())) {
				view.addObject("roleToken", "SK_USER");
			}
			Enterprise enterprise = enterpriseAppService.getEnterpriseByCustId(custId);
			String eCustId = enterprise.getElAccount();
			eCustId = StringUtil.formatElAccountNo(eCustId);
			view.addObject("eCustId", eCustId);
			view.addObject("proleName", proleName);
			view.addObject("custName", custName);
			view.addObject("custId", custId);
			view.addObject("accountAmt", accountAmt);
			view.setViewName("account/findcingAcInfo");
			logger.info("响应参数:custId--{},账户余额--{},企业角色名称--{}",new Object[] {custId,accountAmt,proleName});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.info("[跳转账户信息页]异常",e);
			throw new StockBusinessException(e.getMessage());
		}
		logger.info("跳转账户信息页结束");
		return view;

	}

}