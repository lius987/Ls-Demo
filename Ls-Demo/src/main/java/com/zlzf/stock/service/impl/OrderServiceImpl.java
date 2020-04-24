package com.zlzf.stock.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.zlzf.stock.dao.OrderDao;
import com.zlzf.stock.model.entity.Order;
import com.zlzf.stock.service.OrderService;

/**
 * @Description: 
 * @author: liushuang
 * @date:2020年4月22日 上午9:52:43
 */
public class OrderServiceImpl implements OrderService {

	@Autowired
	@Qualifier("orderDao")
	private OrderDao orderDao;
	
	public Order findYearIncomeAmt(String year, String custId, String organizationId) {
		return orderDao.findYearIncomeAmt(year,custId,organizationId);

	}

	@Override
	public Order findYearPayAmt(String year, String custId, String organizationId) {
		return orderDao.findYearPayAmt(year,custId,organizationId);
		
	}

}
