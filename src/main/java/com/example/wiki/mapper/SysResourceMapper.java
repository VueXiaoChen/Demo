package com.example.wiki.mapper;

import com.example.wiki.domain.SysResource;
import com.example.wiki.domain.SysResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysResourceMapper {
    long countByExample(SysResourceExample example);

    int deleteByExample(SysResourceExample example);

    int deleteByPrimaryKey(Long resourceid);

    int insert(SysResource row);

    int insertSelective(SysResource row);

    List<SysResource> selectByExample(SysResourceExample example);

    SysResource selectByPrimaryKey(Long resourceid);

    int updateByExampleSelective(@Param("row") SysResource row, @Param("example") SysResourceExample example);

    int updateByExample(@Param("row") SysResource row, @Param("example") SysResourceExample example);

    int updateByPrimaryKeySelective(SysResource row);

    int updateByPrimaryKey(SysResource row);
}