package com.zking.ssm.model;

public class Sysright {
    private Integer perid;

    private String pername;

    private Integer pid;

    private String permission;

    private String rightUrl;

    public Sysright(Integer perid, String pername, Integer pid, String permission, String rightUrl) {
        this.perid = perid;
        this.pername = pername;
        this.pid = pid;
        this.permission = permission;
        this.rightUrl = rightUrl;
    }

    public Sysright() {
        super();
    }

    public Integer getPerid() {
        return perid;
    }

    public void setPerid(Integer perid) {
        this.perid = perid;
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getRightUrl() {
        return rightUrl;
    }

    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl;
    }
}