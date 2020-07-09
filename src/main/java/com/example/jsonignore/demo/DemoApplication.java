package com.example.jsonignore.demo;

import com.example.jsonignore.demo.common.DisablingMyJsonIgnoreIntrospector;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DemoApplication{

    public static void main(String[] args){
        SpringApplication.run(DemoApplication.class, args);

    }


}
