package com.zking.ssm.mapper;

import com.zking.ssm.model.Roomtype;

public interface RoomtypeMapper {
    int deleteByPrimaryKey(Integer roomId);

    int insert(Roomtype record);

    int insertSelective(Roomtype record);

    Roomtype selectByPrimaryKey(Integer roomId);

    int updateByPrimaryKeySelective(Roomtype record);

    int updateByPrimaryKey(Roomtype record);
}