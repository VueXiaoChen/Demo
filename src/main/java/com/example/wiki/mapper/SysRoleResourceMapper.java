package com.example.wiki.mapper;

import com.example.wiki.domain.SysRoleResource;
import com.example.wiki.domain.SysRoleResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleResourceMapper {
    long countByExample(SysRoleResourceExample example);

    int deleteByExample(SysRoleResourceExample example);

    int insert(SysRoleResource row);

    int insertSelective(SysRoleResource row);

    List<SysRoleResource> selectByExample(SysRoleResourceExample example);

    int updateByExampleSelective(@Param("row") SysRoleResource row, @Param("example") SysRoleResourceExample example);

    int updateByExample(@Param("row") SysRoleResource row, @Param("example") SysRoleResourceExample example);
}