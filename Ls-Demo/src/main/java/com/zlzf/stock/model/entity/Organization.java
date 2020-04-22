package com.zlzf.stock.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Organization implements Serializable {
    private String id;

    private String name;

    private String code;

    private String status;

    private String auditStatus;

    private String auditor;

    private String description;

    private Date createdate;

    private Date updatedate;

    private String custsubject;

    private String orgtype;

    private String type;
    
    List<OrgEnter> roleList;
    
    

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getCustsubject() {
        return custsubject;
    }

    public void setCustsubject(String custsubject) {
        this.custsubject = custsubject == null ? null : custsubject.trim();
    }

    public String getOrgtype() {
        return orgtype;
    }

    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype == null ? null : orgtype.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

	public List<OrgEnter> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<OrgEnter> roleList) {
		this.roleList = roleList;
	}
    
}