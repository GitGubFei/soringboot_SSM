package com.itfei.mapper;

import com.itfei.model.SysRoleRight;

public interface SysRoleRightMapper {
    int deleteByPrimaryKey(Integer rfId);

    int insert(SysRoleRight record);

    int insertSelective(SysRoleRight record);

    SysRoleRight selectByPrimaryKey(Integer rfId);

    int updateByPrimaryKeySelective(SysRoleRight record);

    int updateByPrimaryKey(SysRoleRight record);
}