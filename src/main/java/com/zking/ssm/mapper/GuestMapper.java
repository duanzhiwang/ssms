package com.zking.ssm.mapper;

import com.zking.ssm.model.Guest;

public interface GuestMapper {
    int deleteByPrimaryKey(Integer guestId);

    int insert(Guest record);

    int insertSelective(Guest record);

    Guest selectByPrimaryKey(Integer guestId);

    int updateByPrimaryKeySelective(Guest record);

    int updateByPrimaryKey(Guest record);
}