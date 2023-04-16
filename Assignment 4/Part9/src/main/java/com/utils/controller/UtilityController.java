package com.utils.controller;

import com.utils.pojo.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {
    
    @Autowired
    AppConfig appConfig;


	 

    @GetMapping("/homepage")
    public String showMessage(Model model){
        Utility util= appConfig.getUtilityBean();
        model.addAttribute("util",util);
        return "homepage";
    }
}
