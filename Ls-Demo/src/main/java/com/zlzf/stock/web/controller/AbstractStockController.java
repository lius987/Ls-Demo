package com.zlzf.stock.web.controller;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.ylinkpay.web.mvc.controller.BaseMVCController;

import net.bytebuddy.asm.Advice.This;

/** 
 * @Description: 刘双仿写交易所资金结算系统控制器抽象类
 * @author: liushuang
 * @date: 2020年4月16 下午14:15  
 *
 *抽象类作用 : 封装某一共同功能
 */
public abstract class AbstractStockController extends BaseMVCController {
	protected Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	//全天的秒数
	private static  final int ALL_DAY_SECONDS= 86400;
	
	/**
	 * 
	 * @Description: 获取request 参数 
	 * @param name
	 * @return
	 * String
	 * @author: liushuang
	 * @date:2020年4月16日 下午2:28:02
	 */
	protected String getParameter(String name) {
		return name;
		
		
	}
	
}