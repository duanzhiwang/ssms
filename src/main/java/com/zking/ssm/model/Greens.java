package com.zking.ssm.model;

public class Greens {
//    菜品类型表
    private Integer greensId;

    private String greensType;

    public Greens(Integer greensId, String greensType) {
        this.greensId = greensId;
        this.greensType = greensType;
    }

    public Greens() {
        super();
    }

    public Integer getGreensId() {
        return greensId;
    }

    public void setGreensId(Integer greensId) {
        this.greensId = greensId;
    }

    public String getGreensType() {
        return greensType;
    }

    public void setGreensType(String greensType) {
        this.greensType = greensType;
    }
}