package com.fn.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fn.common.CustomMapArgumentResolver;

@Configuration
@EnableWebMvc
public class WebMvcContext extends WebMvcConfigurerAdapter {
  
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new CustomMapArgumentResolver());
    }

}
