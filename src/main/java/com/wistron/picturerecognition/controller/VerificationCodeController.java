package com.wistron.picturerecognition.controller;

import com.wistron.picturerecognition.util.VerificationCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;

@RestController
public class VerificationCodeController extends HttpServlet {
    @Override
    @RequestMapping("/VerificationCode")
    protected void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        try {
            //设置响应数据类型
            httpServletResponse.setContentType("image/jpg");
            //创建输出流
            ServletOutputStream servletOutputStream = httpServletResponse.getOutputStream();
            /**
             * 生成验证码图片
             */
            //准备画布
            BufferedImage bufferedImage = new BufferedImage(60, 20, BufferedImage.TYPE_INT_RGB);
            //准备画笔
            Graphics graphics = bufferedImage.getGraphics();
            //设置验证码的背景颜色和大小
            graphics.setColor(Color.black);
            graphics.drawRect(0, 0, 60, 20);
            //设置验证码的字体颜色
            graphics.setColor(Color.white);
            //生成验证码
            char[] randomNumber = VerificationCode.createRandomNumber();
            //指定每个验证码的位置
            graphics.drawString(""+randomNumber[0],8,15);
            graphics.drawString(""+randomNumber[1],18,16);
            graphics.drawString(""+randomNumber[2],35,14);
            graphics.drawString(""+randomNumber[3],50,15);
            //生成画
            graphics.dispose();
            //生成图片
            ImageIO.write(bufferedImage, "jpg", servletOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
