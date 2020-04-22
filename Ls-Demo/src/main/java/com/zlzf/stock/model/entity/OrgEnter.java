package com.zlzf.stock.model.entity;

import java.util.Date;

/** 
 * @Description: 组织企业关系实体
 * @author: libingtan
 * @date: 2018年8月24日 下午2:11:48  
 */
public class OrgEnter extends OrgEnterKey {
    private String organizationName;

    private String enterpriseName;

    private Date createdate;
    
    private String roleName;
    
    private Role role;

    public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}