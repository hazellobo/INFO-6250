/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.utils.shop.controller;

import com.utils.shop.model.Cart;
import com.utils.shop.model.Product;
import java.io.IOException;
import java.util.Base64;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hazel
 */
@Controller
public class CartController{
    
    public CartController() {
    }
    
    @RequestMapping(value = "/book", method = RequestMethod.GET )
    protected ModelAndView book(){
        return new ModelAndView("book");
    }
    
    @RequestMapping(value = "/computer", method = RequestMethod.GET )
    protected ModelAndView computer(){
        return new ModelAndView("computer");
    }
    
    @RequestMapping(value = "/music", method = RequestMethod.GET )
    protected ModelAndView music(){
        return new ModelAndView("music");
    }
    
    @RequestMapping(value = "/cart", method = RequestMethod.GET )
    protected ModelAndView cart(){
        return new ModelAndView("cart");
    }
    
    protected ModelAndView handleAddToCartRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String[] addedCartItems = null;
        if(request.getParameterValues("books")!=null){
            addedCartItems = request.getParameterValues("books");
        }else if(request.getParameterValues("computers")!=null){
            addedCartItems = request.getParameterValues("computers");
        }else if(request.getParameterValues("music")!=null){
            addedCartItems = request.getParameterValues("music");
        }
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        if(cart == null){
            cart = new Cart();

        }
        for(String name:addedCartItems){
            Product product = new Product(name,1);
            cart.addProduct(product);
        }
        session.setAttribute("addedCartItems",addedCartItems);
        session.setAttribute("cart",cart);
        return new ModelAndView("addedtoCart");
    }
    
    @RequestMapping(value = "/addToCart", method = RequestMethod.POST )
    protected ModelAndView addToCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String authorization = request.getHeader("Authorization");
        ModelAndView modelAndView=null;
        if (authorization == null) {
                askForPassword(response);
        }else{
            String userInfo = authorization.substring(6).trim();
            Base64.Decoder decoder = Base64.getDecoder();
            String nameAndPassword = new String(decoder.decode(userInfo));
            // Decoded part looks like "username:password".
            int index = nameAndPassword.indexOf(":");
            String user = nameAndPassword.substring(0, index);
            String password = nameAndPassword.substring(index+1);
            // High security: username must be reverse of password.
            
            
            if (areEqualReversed(user, password)) {
                modelAndView = handleAddToCartRequest(request, response);
            } else {
                askForPassword(response);
            }
        }     
        return modelAndView;
    }
    
    @RequestMapping(value = "/updateToCart", method = RequestMethod.POST )
    protected ModelAndView updateToCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        Enumeration<String> en = request.getParameterNames();
        while(en.hasMoreElements()){
            String name = en.nextElement();
            if(name.equals("Submit")) continue;
            int count = Integer.parseInt(request.getParameter(name));
            if(count == 0) cart.deleteProductByName(name);
            else{
                cart.updateProduct(name,count);
            }
        }
        session.setAttribute("cart",cart);
        return new ModelAndView("cart");

    }
    
    private void askForPassword(HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED); // I.e., 401
        response.setHeader("WWW-Authenticate",
        "BASIC realm=\"Insider-Trading\"");
    }
    
    private boolean areEqualReversed(String s1, String s2) {
        s2 = (new StringBuffer(s2)).reverse().toString();
        return((s1.length() > 0) && s1.equals(s2));
    }
    
}
