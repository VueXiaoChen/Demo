package com.example.wiki.mapper;

import com.example.wiki.domain.Courses;
import com.example.wiki.domain.CoursesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursesMapper {
    long countByExample(CoursesExample example);

    int deleteByExample(CoursesExample example);

    int deleteByPrimaryKey(Long courseid);

    int insert(Courses row);

    int insertSelective(Courses row);

    List<Courses> selectByExample(CoursesExample example);

    Courses selectByPrimaryKey(Long courseid);

    int updateByExampleSelective(@Param("row") Courses row, @Param("example") CoursesExample example);

    int updateByExample(@Param("row") Courses row, @Param("example") CoursesExample example);

    int updateByPrimaryKeySelective(Courses row);

    int updateByPrimaryKey(Courses row);
}