package com.zking.ssm.model;

public class Seat {
//    座位类型表
    private Integer seatId;

    private String seatType;

    public Seat(Integer seatId, String seatType) {
        this.seatId = seatId;
        this.seatType = seatType;
    }

    public Seat() {
        super();
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
}