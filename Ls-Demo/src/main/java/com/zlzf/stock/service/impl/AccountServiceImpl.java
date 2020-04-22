package com.zlzf.stock.service.impl;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ylink.ylpay.common.project.account.app.AccountQueryAppService;
import com.ylink.ylpay.common.project.account.dto.AccountInfoDTO;
import com.ylink.ylpay.common.project.account.exception.AccountCheckedException;
import com.zlzf.stock.service.AccountService;
import com.zlzf.stock.service.OrganizationService;


@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	private static Logger logger = (Logger) LoggerFactory.getLogger(AccountServiceImpl.class);

	@Autowired
	@Qualifier("accountQueryAppService")
	private AccountQueryAppService accountQueryAppService;
	
	@Autowired
	@Qualifier("organizationAppService")
	private OrganizationService organizationService;
	
	//查询企业客户余额 
	public long queryAccountBalance(String custId, String organizationId) throws AccountCheckedException {
		long cashAmount = 0;
		AccountInfoDTO acct = null ;
		if (StringUtils.isBlank(organizationId)) {
			acct = accountQueryAppService.getCustAccountInfo(custId, findCustType(custId));//根据二级科目（账户类型）查询客户账户信息
		}else {
			acct = accountQueryAppService.getCustAccountInfo(custId, "2011101");
		}
		if (acct !=null) {
			cashAmount = acct.getCashAmount();
		}
		return cashAmount;
	}

	//根据客户号或者产品账户号查询账户类型 
	public String findCustType(String organizationId) {//查询客户账户类型 
		return organizationService.findByID(organizationId).getCustsubject();
	}

	
}
