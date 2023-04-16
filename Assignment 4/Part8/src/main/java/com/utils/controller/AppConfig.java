/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils.controller;

import com.utils.pojo.Utility;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author hazel
 */
@Configuration
public class AppConfig {
    
    @Bean
    @Scope(value="singleton")
    public Utility getUtilityBean() {
		return new Utility("Part 8");
	}
}
