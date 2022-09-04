package com.example.wiki.mapper;

import com.example.wiki.domain.Students;
import com.example.wiki.domain.StudentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsMapper {
    long countByExample(StudentsExample example);

    int deleteByExample(StudentsExample example);

    int deleteByPrimaryKey(Long studentid);

    int insert(Students row);

    int insertSelective(Students row);

    List<Students> selectByExample(StudentsExample example);

    Students selectByPrimaryKey(Long studentid);

    int updateByExampleSelective(@Param("row") Students row, @Param("example") StudentsExample example);

    int updateByExample(@Param("row") Students row, @Param("example") StudentsExample example);

    int updateByPrimaryKeySelective(Students row);

    int updateByPrimaryKey(Students row);
}