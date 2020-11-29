package com.zking.ssm.mapper;

import com.zking.ssm.model.Sysuser;

public interface SysuserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Sysuser record);

    int insertSelective(Sysuser record);

    Sysuser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Sysuser record);

    int updateByPrimaryKey(Sysuser record);
}