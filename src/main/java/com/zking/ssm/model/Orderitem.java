package com.zking.ssm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Orderitem {
//客房订单详情表
    private Integer orderItemId;

    private Integer orderId;

    private Integer guestId;

    private Integer orderItemQuantity;

    private BigDecimal orderItemPrice;

    private Date orderItemCheck;

    private Date orderItemRetreat;

    public Orderitem(Integer orderItemId, Integer orderId, Integer guestId, Integer orderItemQuantity, BigDecimal orderItemPrice, Date orderItemCheck, Date orderItemRetreat) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.guestId = guestId;
        this.orderItemQuantity = orderItemQuantity;
        this.orderItemPrice = orderItemPrice;
        this.orderItemCheck = orderItemCheck;
        this.orderItemRetreat = orderItemRetreat;
    }

    public Orderitem() {
        super();
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public Integer getOrderItemQuantity() {
        return orderItemQuantity;
    }

    public void setOrderItemQuantity(Integer orderItemQuantity) {
        this.orderItemQuantity = orderItemQuantity;
    }

    public BigDecimal getOrderItemPrice() {
        return orderItemPrice;
    }

    public void setOrderItemPrice(BigDecimal orderItemPrice) {
        this.orderItemPrice = orderItemPrice;
    }

    public Date getOrderItemCheck() {
        return orderItemCheck;
    }

    public void setOrderItemCheck(Date orderItemCheck) {
        this.orderItemCheck = orderItemCheck;
    }

    public Date getOrderItemRetreat() {
        return orderItemRetreat;
    }

    public void setOrderItemRetreat(Date orderItemRetreat) {
        this.orderItemRetreat = orderItemRetreat;
    }
}