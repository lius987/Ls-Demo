package com.zlzf.stock.common.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.zlzf.stock.common.exception.StockBusinessException;
import com.zlzf.stock.model.entity.User;

/**
 * @Description: 
 * @author: liushuang
 * @date:2020年3月31日 下午5:00:58
 */

public class SessionManager {
	/**
	 * @Description: 取用户
	 * @param request
	 * @return
	 * User
	 * @author: liushuang
	 * @date:2020年4月16日 下午3:44:34
	 */
	public User getCurrUser(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute(Constants.SESSION_USER);
		if (user == null) {
			throw new StockBusinessException("user_logout");
		}
		return user;
	}
	/**
	 * @Description: 无参获取用户信息
	 * @param request
	 * @return
	 * User
	 * @author: liushuang
	 * @date:2020年4月16日 下午3:43:09
	 */
	public User getCurrUser() {
		HttpServletRequest request = ( ( ServletRequestAttributes ) RequestContextHolder.getRequestAttributes()).getRequest();
		User user = this.getCurrUser(request);
		Assert.notNull(user, "未获取到当前session用户");
		if (request.getParameter("usertoken")!=null) {
			//老的token值/从浏览器的获取的token值
			String oldUserId = request.getParameter("usertoken");
			String userId = user.getId();
			if (!oldUserId.equals(userId)) {
				throw new StockBusinessException("usertoken_invalid");
			}
			
	}
	return user;
}
}
