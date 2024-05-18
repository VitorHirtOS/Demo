package com.example.demo.controllers;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/")
    public String layout(Model model){
        model.addAttribute("pageTitle", "DedSec");
        return "layout";
    }


}
