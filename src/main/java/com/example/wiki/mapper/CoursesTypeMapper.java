package com.example.wiki.mapper;

import com.example.wiki.domain.CoursesType;
import com.example.wiki.domain.CoursesTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursesTypeMapper {
    long countByExample(CoursesTypeExample example);

    int deleteByExample(CoursesTypeExample example);

    int deleteByPrimaryKey(Long coursestypeid);

    int insert(CoursesType row);

    int insertSelective(CoursesType row);

    List<CoursesType> selectByExample(CoursesTypeExample example);

    CoursesType selectByPrimaryKey(Long coursestypeid);

    int updateByExampleSelective(@Param("row") CoursesType row, @Param("example") CoursesTypeExample example);

    int updateByExample(@Param("row") CoursesType row, @Param("example") CoursesTypeExample example);

    int updateByPrimaryKeySelective(CoursesType row);

    int updateByPrimaryKey(CoursesType row);
}