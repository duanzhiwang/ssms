package com.zking.ssm.model;

import java.util.Date;

public class Comment {
//    评论表
    private Integer commentId;

    private Integer guestId;

    private Integer userId;

    private String commentContent;

    private Date commemtDate;

    public Comment(Integer commentId, Integer guestId, Integer userId, String commentContent, Date commemtDate) {
        this.commentId = commentId;
        this.guestId = guestId;
        this.userId = userId;
        this.commentContent = commentContent;
        this.commemtDate = commemtDate;
    }

    public Comment() {
        super();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommemtDate() {
        return commemtDate;
    }

    public void setCommemtDate(Date commemtDate) {
        this.commemtDate = commemtDate;
    }
}