package com.student.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class firstEnter {
    @RequestMapping(value="/home")
    public String getHomePage(){
        return "index.html";
    }
}
