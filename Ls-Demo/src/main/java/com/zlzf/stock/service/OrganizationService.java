package com.zlzf.stock.service;

import com.zlzf.stock.model.entity.Organization;

public interface OrganizationService {
	/**
	 * @Description: 根据id 查看组织详细信息
	 * @param id
	 * @return
	 * Organization
	 * @author: liushuang
	 * @date:2020年4月21日 下午3:23:46
	 */
	public Organization findByID(String id);

}
