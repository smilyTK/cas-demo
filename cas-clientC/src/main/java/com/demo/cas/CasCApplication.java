package com.demo.cas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableCasClient//启用cas client
public class CasCApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasCApplication.class, args);
    }
}
