package com.example.springsecurityapplication.config;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {

    @Value(" http://localhost:8080/user(здесь указывается нужный url, который обработан в контроллере) http://localhost:8080/user(здесь указывается нужный url, который обработан в контроллере)${upload.path}")
    private String uploadPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**")
                .addResourceLocations("file://" + uploadPath + "/");

    }
}
