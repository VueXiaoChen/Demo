package com.example.wiki.mapper;

import com.example.wiki.domain.SysRoles;
import com.example.wiki.domain.SysRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolesMapper {
    long countByExample(SysRolesExample example);

    int deleteByExample(SysRolesExample example);

    int deleteByPrimaryKey(Long roleid);

    int insert(SysRoles row);

    int insertSelective(SysRoles row);

    List<SysRoles> selectByExample(SysRolesExample example);

    SysRoles selectByPrimaryKey(Long roleid);

    int updateByExampleSelective(@Param("row") SysRoles row, @Param("example") SysRolesExample example);

    int updateByExample(@Param("row") SysRoles row, @Param("example") SysRolesExample example);

    int updateByPrimaryKeySelective(SysRoles row);

    int updateByPrimaryKey(SysRoles row);
}