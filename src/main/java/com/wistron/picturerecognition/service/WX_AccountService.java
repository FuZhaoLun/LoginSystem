package com.wistron.picturerecognition.service;

import com.wistron.picturerecognition.entity.WX_Account;

import java.util.List;

public interface WX_AccountService {
    List<String> queryUserName();
    String queryPassword(String empNo);
    Integer register(String registerData);
}
