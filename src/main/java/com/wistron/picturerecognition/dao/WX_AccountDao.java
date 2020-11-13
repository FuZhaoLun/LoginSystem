package com.wistron.picturerecognition.dao;

import com.wistron.picturerecognition.entity.WX_Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WX_AccountDao {
    @Select("select AccountID from WX_Account")
    List<String> queryUserName();
    @Select("select Password from WX_Account where AccountID=#{empNo}")
    String queryPassword(@Param("empNo") String empNo);
}
