package com.zlzf.stock.service.impl;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zlzf.stock.dao.RoleDao;
import com.zlzf.stock.model.entity.Role;
import com.zlzf.stock.service.RoleService;

import ch.qos.logback.classic.Logger;

/**
 * @Description: 
 * @author: liushuang
 * @date:2020年4月24日 下午1:57:24
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

	public Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	@Qualifier("roleDao")
	private RoleDao roleDao;
	@Override
	public Role findById(String EnterpriseId) {
		return roleDao.selectByPrimaryKey(EnterpriseId);

	}

}
