package com.zlzf.stock.service;

import com.zlzf.stock.model.entity.Role;

/**
 * 
 * @Description: 角色相关service  
 * @author shicongyang
 * @date 2018年5月7日 下午4:51:20  
 *
 */
public interface RoleService {
	/**
	 * @Description: 根据主键 找角色
	 * @param EnterpriseId
	 * @return
	 * Role
	 * @author: liushuang
	 * @date:2020年4月24日 下午2:00:09
	 */
	public Role findById(String EnterpriseId);
}
