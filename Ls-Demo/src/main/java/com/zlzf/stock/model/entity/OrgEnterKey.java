package com.zlzf.stock.model.entity;

/** 
 * @Description: 组织企业关系主键实体
 * @author: libingtan
 * @date: 2018年8月24日 下午2:11:19  
 */
public class OrgEnterKey {
    private String organizationId;

    private String enterpriseId;
    
    private String roleId;

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId == null ? null : enterpriseId.trim();
    }

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
    
}