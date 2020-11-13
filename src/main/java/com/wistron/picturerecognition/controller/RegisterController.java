package com.wistron.picturerecognition.controller;

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
public class RegisterController {
    @Autowired
    WX_AccountService wx_accountService;
    @RequestMapping(value = "/Register",method = RequestMethod.GET)
    public void register(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        try {
            httpServletRequest.setCharacterEncoding("UTF-8");
            httpServletResponse.setCharacterEncoding("UTF-8");
            PrintWriter writer = httpServletResponse.getWriter();
            String userName = httpServletRequest.getParameter("userName");
            String passwordParam = httpServletRequest.getParameter("password");
            String password = wx_accountService.queryPassword(userName);
            if(password==null||(!passwordParam.equals(password))){
                writer.println("Register Failed!");
            }
            else if(passwordParam.equals(password)){
                writer.println("Register Successful!");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/RegisterCheck",method = RequestMethod.GET)
    public void checkUserName(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
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
            if(i>=1){
                writer.println("用户名已存在！");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/CheckPassword",method = RequestMethod.GET)
    public void checkPassword(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        try {
            httpServletRequest.setCharacterEncoding("UTF-8");
            httpServletResponse.setCharacterEncoding("UTF-8");
            PrintWriter writer = httpServletResponse.getWriter();
            String password1 = httpServletRequest.getParameter("password1");
            String password2 = httpServletRequest.getParameter("password2");
            if(!password1.equals(password2)){
                writer.println("密码不一致!");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
