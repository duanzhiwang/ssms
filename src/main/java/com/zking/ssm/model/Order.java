package com.zking.ssm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
//    订单表
    private Integer orderId;

    private Integer userId;

    private Date orderDate;

    private BigDecimal orderPrice;

    public Order(Integer orderId, Integer userId, Date orderDate, BigDecimal orderPrice) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
    }

    public Order() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }
}