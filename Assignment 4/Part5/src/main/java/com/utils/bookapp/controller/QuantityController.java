/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.utils.bookapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author hazel
 */
public class QuantityController extends AbstractController {
    
    public QuantityController() {
    }
    
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,HttpServletResponse response) throws Exception {
        String num = request.getParameter("quantity");
        int count = Integer.parseInt(num);
        return new ModelAndView("addBooks","count",count);
    }
    
}
