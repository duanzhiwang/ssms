package com.zking.ssm.model;

public class Sysuser {
    private Integer userId;

    private String usrName;

    private String usrPassword;

    private String usrSalt;

    public Sysuser(Integer userId, String usrName, String usrPassword, String usrSalt) {
        this.userId = userId;
        this.usrName = usrName;
        this.usrPassword = usrPassword;
        this.usrSalt = usrSalt;
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

    public String getUsrSalt() {
        return usrSalt;
    }

    public void setUsrSalt(String usrSalt) {
        this.usrSalt = usrSalt;
    }
}