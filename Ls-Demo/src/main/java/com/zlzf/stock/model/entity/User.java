package com.zlzf.stock.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

	private String id;

    private String username;

    private String loginname;

    private String mobile;

    private String password;

    private String salt;

    private String type;

    private String status;

    private Date createdate;

    private Date updatedate;
    
    private List<Role> roleList;

    private String enterpriseId;

    private String organizationId;

    private String auditStatus;

    private String auditor;

    private String description;

    private String enterpriseName;

    private String usercN;

  //用户CN
    private String userCN;
    
    private String operationType;    
    
    private String entpRoleId;
    
    private String entpRoleName;
    
    private String entpRoleDesc;
    //记录特殊的权限 （特别权限和协助审核权限）
    private String specialPmsn;
    //记录是否存在 多个圈子或者多个企业角色

    private String hasAnyOrg;   
    
    //重置密码 状态 空 已经重置 不为空 已经重置
    //（解决首次重置密码前,维护修改了用户其他信息导致无法自动提示重置密码）
    
    private String restPwdStutas;
    
    /**
     * 授权码
     */
    private String authCode ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getUsercN() {
		return usercN;
	}

	public void setUsercN(String usercN) {
		this.usercN = usercN;
	}

	public String getUserCN() {
		return userCN;
	}

	public void setUserCN(String userCN) {
		this.userCN = userCN;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getEntpRoleId() {
		return entpRoleId;
	}

	public void setEntpRoleId(String entpRoleId) {
		this.entpRoleId = entpRoleId;
	}

	public String getEntpRoleName() {
		return entpRoleName;
	}

	public void setEntpRoleName(String entpRoleName) {
		this.entpRoleName = entpRoleName;
	}

	public String getEntpRoleDesc() {
		return entpRoleDesc;
	}

	public void setEntpRoleDesc(String entpRoleDesc) {
		this.entpRoleDesc = entpRoleDesc;
	}

	public String getSpecialPmsn() {
		return specialPmsn;
	}

	public void setSpecialPmsn(String specialPmsn) {
		this.specialPmsn = specialPmsn;
	}

	public String getHasAnyOrg() {
		return hasAnyOrg;
	}

	public void setHasAnyOrg(String hasAnyOrg) {
		this.hasAnyOrg = hasAnyOrg;
	}

	public String getRestPwdStutas() {
		return restPwdStutas;
	}

	public void setRestPwdStutas(String restPwdStutas) {
		this.restPwdStutas = restPwdStutas;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", loginname=" + loginname + ", mobile=" + mobile
				+ ", password=" + password + ", salt=" + salt + ", type=" + type + ", status=" + status
				+ ", createdate=" + createdate + ", updatedate=" + updatedate + ", roleList=" + roleList
				+ ", enterpriseId=" + enterpriseId + ", organizationId=" + organizationId + ", auditStatus="
				+ auditStatus + ", auditor=" + auditor + ", description=" + description + ", enterpriseName="
				+ enterpriseName + ", usercN=" + usercN + ", userCN=" + userCN + ", operationType=" + operationType
				+ ", entpRoleId=" + entpRoleId + ", entpRoleName=" + entpRoleName + ", entpRoleDesc=" + entpRoleDesc
				+ ", specialPmsn=" + specialPmsn + ", hasAnyOrg=" + hasAnyOrg + ", restPwdStutas=" + restPwdStutas
				+ ", authCode=" + authCode + "]";
	}

    
   }