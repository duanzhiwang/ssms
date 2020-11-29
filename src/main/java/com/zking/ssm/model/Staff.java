package com.zking.ssm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Staff {
//    员工表
    private Integer staffId;

    private String staffName;

    private String staffSex;

    private BigDecimal staffSalary;

    private String staffPhone;

    private String staffSite;

    private Integer roleId;

    private String siteIdentity;

    private Date siteDate;

    public Staff(Integer staffId, String staffName, String staffSex, BigDecimal staffSalary, String staffPhone, String staffSite, Integer roleId, String siteIdentity, Date siteDate) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffSex = staffSex;
        this.staffSalary = staffSalary;
        this.staffPhone = staffPhone;
        this.staffSite = staffSite;
        this.roleId = roleId;
        this.siteIdentity = siteIdentity;
        this.siteDate = siteDate;
    }

    public Staff() {
        super();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex;
    }

    public BigDecimal getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(BigDecimal staffSalary) {
        this.staffSalary = staffSalary;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getStaffSite() {
        return staffSite;
    }

    public void setStaffSite(String staffSite) {
        this.staffSite = staffSite;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getSiteIdentity() {
        return siteIdentity;
    }

    public void setSiteIdentity(String siteIdentity) {
        this.siteIdentity = siteIdentity;
    }

    public Date getSiteDate() {
        return siteDate;
    }

    public void setSiteDate(Date siteDate) {
        this.siteDate = siteDate;
    }
}