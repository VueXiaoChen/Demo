package com.example.wiki.mapper;

import com.example.wiki.domain.Duty;
import com.example.wiki.domain.DutyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DutyMapper {
    long countByExample(DutyExample example);

    int deleteByExample(DutyExample example);

    int deleteByPrimaryKey(Long dutyid);

    int insert(Duty row);

    int insertSelective(Duty row);

    List<Duty> selectByExample(DutyExample example);

    Duty selectByPrimaryKey(Long dutyid);

    int updateByExampleSelective(@Param("row") Duty row, @Param("example") DutyExample example);

    int updateByExample(@Param("row") Duty row, @Param("example") DutyExample example);

    int updateByPrimaryKeySelective(Duty row);

    int updateByPrimaryKey(Duty row);
}