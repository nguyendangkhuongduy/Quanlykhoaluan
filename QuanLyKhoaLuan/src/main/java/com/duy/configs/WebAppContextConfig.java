/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duy.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author Admin
 */
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = {
        "com.duy.controllers",
        "com.duy.repository",
        "com.duy.service",
        })
public class WebAppContextConfig implements WebMvcConfigurer {

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer conf) {
        conf.enable();
    }
    
//@Bean
//public InternalResourceViewResolver viewResolver() {
//        InternalResourceViewResolver r = new InternalResourceViewResolver();
//        r.setViewClass(JstlView .class);
//        r.setPrefix("/WEB-INF/jsp/");
//        r.setSuffix(".jsp");
//        
//        return r;
//    }
}


