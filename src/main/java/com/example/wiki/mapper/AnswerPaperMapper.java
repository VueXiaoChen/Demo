package com.example.wiki.mapper;

import com.example.wiki.domain.AnswerPaper;
import com.example.wiki.domain.AnswerPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerPaperMapper {
    long countByExample(AnswerPaperExample example);

    int deleteByExample(AnswerPaperExample example);

    int deleteByPrimaryKey(Long papereid);

    int insert(AnswerPaper row);

    int insertSelective(AnswerPaper row);

    List<AnswerPaper> selectByExample(AnswerPaperExample example);

    AnswerPaper selectByPrimaryKey(Long papereid);

    int updateByExampleSelective(@Param("row") AnswerPaper row, @Param("example") AnswerPaperExample example);

    int updateByExample(@Param("row") AnswerPaper row, @Param("example") AnswerPaperExample example);

    int updateByPrimaryKeySelective(AnswerPaper row);

    int updateByPrimaryKey(AnswerPaper row);
}