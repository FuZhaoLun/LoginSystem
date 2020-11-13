package com.wistron.picturerecognition.controller;

import com.wistron.picturerecognition.entity.WX_Account;
import com.wistron.picturerecognition.service.WX_AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@RestController
public class LoginController {
    @Autowired
    WX_AccountService wx_accountService;
    @RequestMapping(value = "/Login",method = RequestMethod.GET)
    public void login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        try {
            PrintWriter writer = httpServletResponse.getWriter();
            String userName = httpServletRequest.getParameter("userName");
            String passwordParam = httpServletRequest.getParameter("password");
            String password = wx_accountService.queryPassword(userName);
            if(password==null||(!passwordParam.equals(password))){
                writer.println("Login Failed!");
            }
            else if(passwordParam.equals(password)){
                writer.println("Login Successful!");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/LoginCheck",method = RequestMethod.GET)
    public void check(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        try {
            httpServletRequest.setCharacterEncoding("UTF-8");
            httpServletResponse.setCharacterEncoding("UTF-8");
            PrintWriter writer = httpServletResponse.getWriter();
            String userNameParam = httpServletRequest.getParameter("userName");
            List<String> userNameList = wx_accountService.queryUserName();
            int i = 0;
            for (String userName : userNameList) {
                if(userName.equals(userNameParam)){
                    i++;
                }
            }
            if(i!=1){
                writer.println("用户名不合法！");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
