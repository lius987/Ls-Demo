package com.zlzf.stock.service;

import com.ylink.ylpay.common.project.account.exception.AccountCheckedException;

public interface AccountService {
	
	/**
	 * @Description: 查询企业客户余额
	 * @param custId
	 * @param organizationId 圈子id
	 * @return
	 * @throws AccountCheckedException
	 * long
	 * @author: liushuang
	 * @date:2020年4月21日 下午2:54:59
	 */
	public long queryAccountBalance(String  custId ,String organizationId) throws AccountCheckedException;
	
	
	/**
	 * @Description: 根据客户号或者产品账户号查询账户类型
	 * @param custId
	 * @return
	 * String
	 * @author: liushuang
	 * @date:2020年4月21日 下午2:50:37
	 */
	public String findCustType(String custId);
}
	