package com.zking.ssm.model;

import java.math.BigDecimal;

public class Guest {
//客房表
    private Integer guestId;

    private Integer roomId;

    private BigDecimal guestPrice;

    private String guestPicture;

    private String guestParticuiars;

    private String guestStatus;

    public Guest(Integer guestId, Integer roomId, BigDecimal guestPrice, String guestPicture, String guestParticuiars, String guestStatus) {
        this.guestId = guestId;
        this.roomId = roomId;
        this.guestPrice = guestPrice;
        this.guestPicture = guestPicture;
        this.guestParticuiars = guestParticuiars;
        this.guestStatus = guestStatus;
    }

    public Guest() {
        super();
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public BigDecimal getGuestPrice() {
        return guestPrice;
    }

    public void setGuestPrice(BigDecimal guestPrice) {
        this.guestPrice = guestPrice;
    }

    public String getGuestPicture() {
        return guestPicture;
    }

    public void setGuestPicture(String guestPicture) {
        this.guestPicture = guestPicture;
    }

    public String getGuestParticuiars() {
        return guestParticuiars;
    }

    public void setGuestParticuiars(String guestParticuiars) {
        this.guestParticuiars = guestParticuiars;
    }

    public String getGuestStatus() {
        return guestStatus;
    }

    public void setGuestStatus(String guestStatus) {
        this.guestStatus = guestStatus;
    }
}