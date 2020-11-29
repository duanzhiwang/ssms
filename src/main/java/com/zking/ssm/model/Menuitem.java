package com.zking.ssm.model;

import java.math.BigDecimal;

public class Menuitem {
//菜单订单详情表
    private Integer orderItemIdd;

    private Integer orderId;

    private Integer menuId;

    private Integer orderQuantity;

    private BigDecimal orderItemPricee;

    public Menuitem(Integer orderItemIdd, Integer orderId, Integer menuId, Integer orderQuantity, BigDecimal orderItemPricee) {
        this.orderItemIdd = orderItemIdd;
        this.orderId = orderId;
        this.menuId = menuId;
        this.orderQuantity = orderQuantity;
        this.orderItemPricee = orderItemPricee;
    }

    public Menuitem() {
        super();
    }

    public Integer getOrderItemIdd() {
        return orderItemIdd;
    }

    public void setOrderItemIdd(Integer orderItemIdd) {
        this.orderItemIdd = orderItemIdd;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public BigDecimal getOrderItemPricee() {
        return orderItemPricee;
    }

    public void setOrderItemPricee(BigDecimal orderItemPricee) {
        this.orderItemPricee = orderItemPricee;
    }
}