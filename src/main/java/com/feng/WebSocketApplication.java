package com.feng;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author f
 * @date 2023/5/7 21:24
 */
@SpringBootApplication
public class WebSocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSocketApplication.class, args);
        System.out.println("=======================================================");
        System.out.println("                          start success                ");
        System.out.println("=======================================================");
    }
}
