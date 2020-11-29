package com.zking.ssm.mapper;

import com.zking.ssm.model.Menuitem;

public interface MenuitemMapper {
    int deleteByPrimaryKey(Integer orderItemIdd);

    int insert(Menuitem record);

    int insertSelective(Menuitem record);

    Menuitem selectByPrimaryKey(Integer orderItemIdd);

    int updateByPrimaryKeySelective(Menuitem record);

    int updateByPrimaryKey(Menuitem record);
}