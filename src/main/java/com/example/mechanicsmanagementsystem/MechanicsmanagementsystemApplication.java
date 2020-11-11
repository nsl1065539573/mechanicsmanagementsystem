package com.example.mechanicsmanagementsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mechanicsmanagementsystem.mapping")
public class MechanicsmanagementsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MechanicsmanagementsystemApplication.class, args);
    }

}
