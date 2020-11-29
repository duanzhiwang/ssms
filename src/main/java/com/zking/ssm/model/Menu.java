package com.zking.ssm.model;

import java.math.BigDecimal;

public class Menu {
//    菜单表
    private Integer menuId;

    private Integer greensId;

    private String menuName;

    private String menuPicture;

    private BigDecimal menuPrice;

    public Menu(Integer menuId, Integer greensId, String menuName, String menuPicture, BigDecimal menuPrice) {
        this.menuId = menuId;
        this.greensId = greensId;
        this.menuName = menuName;
        this.menuPicture = menuPicture;
        this.menuPrice = menuPrice;
    }

    public Menu() {
        super();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getGreensId() {
        return greensId;
    }

    public void setGreensId(Integer greensId) {
        this.greensId = greensId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuPicture() {
        return menuPicture;
    }

    public void setMenuPicture(String menuPicture) {
        this.menuPicture = menuPicture;
    }

    public BigDecimal getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(BigDecimal menuPrice) {
        this.menuPrice = menuPrice;
    }
}