package com.wistron.picturerecognition;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.wistron.picturerecognition.dao")
public class PicturerecognitionApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(PicturerecognitionApplication.class, args);
	}
}
