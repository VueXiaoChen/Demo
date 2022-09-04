package com.example.wiki.mapper;

import com.example.wiki.domain.SysUserRoles;
import com.example.wiki.domain.SysUserRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserRolesMapper {
    long countByExample(SysUserRolesExample example);

    int deleteByExample(SysUserRolesExample example);

    int insert(SysUserRoles row);

    int insertSelective(SysUserRoles row);

    List<SysUserRoles> selectByExample(SysUserRolesExample example);

    int updateByExampleSelective(@Param("row") SysUserRoles row, @Param("example") SysUserRolesExample example);

    int updateByExample(@Param("row") SysUserRoles row, @Param("example") SysUserRolesExample example);
}