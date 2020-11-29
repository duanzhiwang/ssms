package com.zking.ssm.model;

import java.util.Date;

public class Message {
//    用户表
    private Integer messageId;

    private String messageName;

    private String messageSex;

    private String messagePhone;

    private String messageIdentity;

    private Date messageDate;

    private Integer userId;

    public Message(Integer messageId, String messageName, String messageSex, String messagePhone, String messageIdentity, Date messageDate, Integer userId) {
        this.messageId = messageId;
        this.messageName = messageName;
        this.messageSex = messageSex;
        this.messagePhone = messagePhone;
        this.messageIdentity = messageIdentity;
        this.messageDate = messageDate;
        this.userId = userId;
    }

    public Message() {
        super();
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public String getMessageSex() {
        return messageSex;
    }

    public void setMessageSex(String messageSex) {
        this.messageSex = messageSex;
    }

    public String getMessagePhone() {
        return messagePhone;
    }

    public void setMessagePhone(String messagePhone) {
        this.messagePhone = messagePhone;
    }

    public String getMessageIdentity() {
        return messageIdentity;
    }

    public void setMessageIdentity(String messageIdentity) {
        this.messageIdentity = messageIdentity;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}