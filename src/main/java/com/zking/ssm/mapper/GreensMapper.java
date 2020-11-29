package com.zking.ssm.mapper;

import com.zking.ssm.model.Greens;

public interface GreensMapper {
    int deleteByPrimaryKey(Integer greensId);

    int insert(Greens record);

    int insertSelective(Greens record);

    Greens selectByPrimaryKey(Integer greensId);

    int updateByPrimaryKeySelective(Greens record);

    int updateByPrimaryKey(Greens record);
}