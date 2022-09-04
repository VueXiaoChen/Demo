package com.example.wiki.mapper;

import com.example.wiki.domain.StudentCourse;
import com.example.wiki.domain.StudentCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentCourseMapper {
    long countByExample(StudentCourseExample example);

    int deleteByExample(StudentCourseExample example);

    int insert(StudentCourse row);

    int insertSelective(StudentCourse row);

    List<StudentCourse> selectByExample(StudentCourseExample example);

    int updateByExampleSelective(@Param("row") StudentCourse row, @Param("example") StudentCourseExample example);

    int updateByExample(@Param("row") StudentCourse row, @Param("example") StudentCourseExample example);
}