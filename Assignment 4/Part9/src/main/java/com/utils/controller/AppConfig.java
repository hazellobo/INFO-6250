/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils.controller;

import com.utils.pojo.Utility;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author hazel
 */
@Configuration
public class AppConfig {
    @Bean
    @Scope(value=WebApplicationContext.SCOPE_REQUEST, proxyMode=ScopedProxyMode.TARGET_CLASS)
    public Utility getUtilityBean() {
		return new Utility("Part 9");
	}
    

}
