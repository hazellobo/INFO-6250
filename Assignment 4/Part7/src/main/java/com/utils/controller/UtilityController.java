package com.utils.controller;

import com.utils.pojo.Utility;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class UtilityController extends AbstractController {
    
    public UtilityController(){
    
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        Utility util = (Utility) this.getApplicationContext().getBean("bean1");
        
        //Checking if the objectID matches for both instances
           request.setAttribute("message", util.getMessage());
           request.setAttribute("objectID", util);
        return new ModelAndView("homepage");
    }
}
