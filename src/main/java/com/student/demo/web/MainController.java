package com.student.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String root() {
        return "index";
    }
    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
    @GetMapping("/home")
    public String home() {
        return "index"; }
    @GetMapping("/aboutUs")
    public String aboutUs(){ return "about"; }
    @GetMapping("/category")
    public String category(){
        return "category";
    }
    @GetMapping("/blog-home")
    public String blogHome(){
        return "blog-home";
    }
    @GetMapping("/blog-details")
    public String blogDetails(){
        return "blog-details";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact-us";
    }
    @GetMapping("/jobcategory")
    public String jobCategory(){
        return "job-category";
    }

    @GetMapping("/job-single")
    public String jobSingle(){
        return  "job-single";
    }
    @GetMapping("/pricing-plan")
    public String pricingPlan(){
        return  "pricing-plan";
    }
    @GetMapping("/elements")
    public String elements(){
        return  "elements";
    }

}
