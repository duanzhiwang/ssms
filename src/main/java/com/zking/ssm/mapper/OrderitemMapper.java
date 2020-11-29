package com.zking.ssm.mapper;

import com.zking.ssm.model.Orderitem;

public interface OrderitemMapper {
    int deleteByPrimaryKey(Integer orderItemId);

    int insert(Orderitem record);

    int insertSelective(Orderitem record);

    Orderitem selectByPrimaryKey(Integer orderItemId);

    int updateByPrimaryKeySelective(Orderitem record);

    int updateByPrimaryKey(Orderitem record);
}