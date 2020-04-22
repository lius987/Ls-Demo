package com.zlzf.stock.web.controller;

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
import com.zlzf.stock.common.utils.DateUtil;
import com.zlzf.stock.common.utils.SessionManager;
import com.zlzf.stock.model.entity.User;
import com.zlzf.stock.service.AccountService;
import com.zlzf.stock.service.OrderService;

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

	private OrderService orderService;

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
			
			String year = DateUtil.getCurrentPrettyYear();
			orderService.findYearIncomeAmt(year,user.getEnterpriseId(),organizationId);
			//根据订单 查询年收入
			
		} catch (AccountCheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}