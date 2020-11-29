package com.zking.ssm.model;

public class Seating {
//    座位表
    private Integer seatingId;

    private Integer seatId;

    private String seatingStatus;

    public Seating(Integer seatingId, Integer seatId, String seatingStatus) {
        this.seatingId = seatingId;
        this.seatId = seatId;
        this.seatingStatus = seatingStatus;
    }

    public Seating() {
        super();
    }

    public Integer getSeatingId() {
        return seatingId;
    }

    public void setSeatingId(Integer seatingId) {
        this.seatingId = seatingId;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public String getSeatingStatus() {
        return seatingStatus;
    }

    public void setSeatingStatus(String seatingStatus) {
        this.seatingStatus = seatingStatus;
    }
}