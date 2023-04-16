/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.utils.bookapp.controller;

import com.utils.bookapp.dao.BookDao;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author hazel
 */
public class AddBookController extends AbstractController {
    
    public AddBookController() {
    }
    
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
            
            String amount = request.getParameter("quantity");
            int count = Integer.parseInt(amount);
            
            List<String> isbnList = new ArrayList<>();
            List<String> titleList = new ArrayList<>();
            List<String> authorsList = new ArrayList<>();
            List<Float> priceList = new ArrayList<>();
            

            //Populating data in array
            for(int i = 0; i < count; i++){
                isbnList.add(request.getParameter("isbn"+i)); 
                titleList.add(request.getParameter("title" + i));
                authorsList.add(request.getParameter("authors" + i));
                priceList.add(Float.valueOf(request.getParameter("price" + i)));
            }

            BookDao bkdao = new BookDao();
            int result = bkdao.addBook(isbnList, titleList, authorsList, priceList);

            ModelAndView modelAndView= null;
            if(result > 0){
                modelAndView= new ModelAndView("addBookSuccess","count",count);
            }else {
                modelAndView= new ModelAndView("error");
            }
            return modelAndView;
    }
    
}
