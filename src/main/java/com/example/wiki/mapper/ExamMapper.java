package com.example.wiki.mapper;

import com.example.wiki.domain.Exam;
import com.example.wiki.domain.ExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamMapper {
    long countByExample(ExamExample example);

    int deleteByExample(ExamExample example);

    int deleteByPrimaryKey(Long examid);

    int insert(Exam row);

    int insertSelective(Exam row);

    List<Exam> selectByExample(ExamExample example);

    Exam selectByPrimaryKey(Long examid);

    int updateByExampleSelective(@Param("row") Exam row, @Param("example") ExamExample example);

    int updateByExample(@Param("row") Exam row, @Param("example") ExamExample example);

    int updateByPrimaryKeySelective(Exam row);

    int updateByPrimaryKey(Exam row);
}