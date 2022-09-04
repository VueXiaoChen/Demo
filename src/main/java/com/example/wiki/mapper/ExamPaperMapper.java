package com.example.wiki.mapper;

import com.example.wiki.domain.ExamPaper;
import com.example.wiki.domain.ExamPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamPaperMapper {
    long countByExample(ExamPaperExample example);

    int deleteByExample(ExamPaperExample example);

    int deleteByPrimaryKey(Long papbreid);

    int insert(ExamPaper row);

    int insertSelective(ExamPaper row);

    List<ExamPaper> selectByExample(ExamPaperExample example);

    ExamPaper selectByPrimaryKey(Long papbreid);

    int updateByExampleSelective(@Param("row") ExamPaper row, @Param("example") ExamPaperExample example);

    int updateByExample(@Param("row") ExamPaper row, @Param("example") ExamPaperExample example);

    int updateByPrimaryKeySelective(ExamPaper row);

    int updateByPrimaryKey(ExamPaper row);
}