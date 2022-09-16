package com.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan
@Configuration
public class ProjectConfig {

    @Bean
    public Student student() {
        return new Student();
    }


}
