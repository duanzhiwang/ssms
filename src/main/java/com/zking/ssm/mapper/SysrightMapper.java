package com.zking.ssm.mapper;

import com.zking.ssm.model.Sysright;

public interface SysrightMapper {
    int deleteByPrimaryKey(String rightCode);

    int insert(Sysright record);

    int insertSelective(Sysright record);

    Sysright selectByPrimaryKey(String rightCode);

    int updateByPrimaryKeySelective(Sysright record);

    int updateByPrimaryKey(Sysright record);
}