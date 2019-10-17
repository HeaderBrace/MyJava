package com.bai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * @SpringBootApplication 说明是Springboot应用程序
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {

        //Spring应用启动
        SpringApplication.run(MainApplication.class,args);
    }
}
