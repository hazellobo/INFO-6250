/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utils.part8.controller;

import com.utils.part8.model.Cart;
import com.utils.part8.model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hazel
 */
@WebServlet(name = "ShoppingController", urlPatterns = {"/shop"})
public class ShoppingController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */    
    protected void handlePostRequest(HttpServletRequest request, HttpServletResponse response)
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
        request.getRequestDispatcher("/addedtoCart.jsp").forward(request,response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
        request.getRequestDispatcher("/cart.jsp").forward(request,response);
    }
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        String authorization = request.getHeader("Authorization");
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
                handlePostRequest(request, response);
            } else {
                askForPassword(response);
            }
        }     
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

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
