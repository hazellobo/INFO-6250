package com.utils.controller;

import com.utils.pojo.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

   @Autowired
    AppConfig con;
   
    
    @GetMapping("/homepage")
    public String showMessage(Model model){
        Utility util1 = con.getUtilityBean();
        model.addAttribute("util1",util1);
        return "homepage";
    }
}
