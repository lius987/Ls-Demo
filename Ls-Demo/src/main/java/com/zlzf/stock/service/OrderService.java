package com.zlzf.stock.service;

import com.zlzf.stock.model.entity.Order;

/**
 *  角色相关service
 */
public interface OrderService {
	/**
	 * @Description: 根据年份查询订单
	 * @param year
	 * @param custId
	 * @param organizationId
	 * @return
	 * Order
	 * @author: liushuang
	 * @date:2020年4月22日 上午9:53:04
	 */
	public Order findYearIncomeAmt(String year,String custId,String organizationId);
	
	/**
	 * @Description: 根据年份查询 支出金额
	 * @param year
	 * @param custId
	 * @param organizationId
	 * @return
	 * Order
	 * @author: liushuang
	 * @date:2020年4月23日 上午10:24:37
	 */
	public Order findYearPayAmt(String year,String custId,String organizationId);
}
