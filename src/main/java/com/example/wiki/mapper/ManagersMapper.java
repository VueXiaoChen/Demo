package com.example.wiki.mapper;

import com.example.wiki.domain.Managers;
import com.example.wiki.domain.ManagersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagersMapper {
    long countByExample(ManagersExample example);

    int deleteByExample(ManagersExample example);

    int deleteByPrimaryKey(Long managbrid);

    int insert(Managers row);

    int insertSelective(Managers row);

    List<Managers> selectByExample(ManagersExample example);

    Managers selectByPrimaryKey(Long managbrid);

    int updateByExampleSelective(@Param("row") Managers row, @Param("example") ManagersExample example);

    int updateByExample(@Param("row") Managers row, @Param("example") ManagersExample example);

    int updateByPrimaryKeySelective(Managers row);

    int updateByPrimaryKey(Managers row);
}