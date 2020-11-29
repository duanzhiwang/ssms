package com.zking.ssm.model;

public class Sysuser {
//    系统用户表
    private Integer userId;

    private String usrName;

    private String usrPassword;

    private String usrFlag;

    public Sysuser(Integer userId, String usrName, String usrPassword, String usrFlag) {
        this.userId = userId;
        this.usrName = usrName;
        this.usrPassword = usrPassword;
        this.usrFlag = usrFlag;
    }

    public Sysuser() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public String getUsrFlag() {
        return usrFlag;
    }

    public void setUsrFlag(String usrFlag) {
        this.usrFlag = usrFlag;
    }
}