package com.wistron.picturerecognition.dao;

import com.wistron.picturerecognition.entity.DL_Members;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DL_MembersDao {
    @Select("select * from DL_Members where EmpNo=#{empNo}")
    DL_Members queryInformation(@Param("empNo") String empNo);
}
