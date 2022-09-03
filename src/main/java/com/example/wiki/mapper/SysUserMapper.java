package com.example.wiki.mapper;

import com.example.wiki.domain.SysUser;
import com.example.wiki.domain.SysUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SysUserMapper {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(SysUser row);

    int insertSelective(SysUser row);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("row") SysUser row, @Param("example") SysUserExample example);

    int updateByExample(@Param("row") SysUser row, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser row);

    int updateByPrimaryKey(SysUser row);
}