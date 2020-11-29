package com.zking.ssm.mapper;

import com.zking.ssm.model.Sysrole;

public interface SysroleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Sysrole record);

    int insertSelective(Sysrole record);

    Sysrole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(Sysrole record);

    int updateByPrimaryKey(Sysrole record);
}