package com.zking.ssm.mapper;

import com.zking.ssm.model.Sysright;

public interface SysrightMapper {
    int deleteByPrimaryKey(Integer perid);

    int insert(Sysright record);

    int insertSelective(Sysright record);

    Sysright selectByPrimaryKey(Integer perid);

    int updateByPrimaryKeySelective(Sysright record);

    int updateByPrimaryKey(Sysright record);
}