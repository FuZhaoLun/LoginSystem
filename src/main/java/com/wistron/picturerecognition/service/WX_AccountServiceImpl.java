package com.wistron.picturerecognition.service;

import com.wistron.picturerecognition.dao.WX_AccountDao;
import com.wistron.picturerecognition.entity.WX_Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WX_AccountServiceImpl implements WX_AccountService {
    @Autowired
    private WX_AccountDao wx_accountDao;
    @Override
    public List<String> queryUserName() {
        List<String> userNameList = wx_accountDao.queryUserName();
        return userNameList;
    }

    @Override
    public String queryPassword(String empNo) {
        String password = wx_accountDao.queryPassword(empNo);
        return password;
    }

    @Override
    public Integer register(String registerData) {
        return null;
    }

    public WX_Account getWX_Account(){
        return null;
    }
}
