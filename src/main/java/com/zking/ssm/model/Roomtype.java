package com.zking.ssm.model;

public class Roomtype {
//    房间类型表
    private Integer roomId;

    private String roomType;

    public Roomtype(Integer roomId, String roomType) {
        this.roomId = roomId;
        this.roomType = roomType;
    }

    public Roomtype() {
        super();
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}