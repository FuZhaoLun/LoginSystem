package com.wistron.picturerecognition.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

public class VerificationCode {
    /**
     * 生成四位随机数
     */
    public static char[] createRandomNumber(){
        String string = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        char[] chars = new char[4];
        for(int i=0;i<4;i++){
            chars[i] = string.charAt(random.nextInt(35));
        }
        return chars;
    }

    /**
     * 生成验证码
     */
    public static void createVerificationCode(){
        try {
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
            char[] randomNumber = createRandomNumber();
            //指定每个验证码的位置
            graphics.drawString(""+randomNumber[0],8,15);
            graphics.drawString(""+randomNumber[1],18,16);
            graphics.drawString(""+randomNumber[2],35,14);
            graphics.drawString(""+randomNumber[3],50,15);
            //生成画
            graphics.dispose();
            //生成图片
            ImageIO.write(bufferedImage, "jpg", new FileOutputStream(new File("E:\\IDEA2019\\GitProject\\LoginSystem\\src\\main\\resources\\static\\picture\\VerificationCode.jpg")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
