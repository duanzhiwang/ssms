package com.zking.ssm.mapper;

import com.zking.ssm.model.Seating;

public interface SeatingMapper {
    int deleteByPrimaryKey(Integer seatingId);

    int insert(Seating record);

    int insertSelective(Seating record);

    Seating selectByPrimaryKey(Integer seatingId);

    int updateByPrimaryKeySelective(Seating record);

    int updateByPrimaryKey(Seating record);
}