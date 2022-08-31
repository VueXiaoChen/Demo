package com.example.wiki.mapper;

import com.example.wiki.domain.Demo;
import com.example.wiki.domain.DemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemoMapper {
    long countByExample(DemoExample example);

    int deleteByExample(DemoExample example);

    int insert(Demo row);

    int insertSelective(Demo row);

    List<Demo> selectByExample(DemoExample example);

    int updateByExampleSelective(@Param("row") Demo row, @Param("example") DemoExample example);

    int updateByExample(@Param("row") Demo row, @Param("example") DemoExample example);
}