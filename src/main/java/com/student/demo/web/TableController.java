package com.student.demo.web;

import com.student.demo.model.User;
import com.student.demo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TableController {
    private UserRepository userRepository;
    @RequestMapping("/job-search")
    public String jobSearch(Model model){
        List<User> l = userRepository.findAll();
        System.out.println(l.get(0).getEmail()+" ================================= ");
        model.addAttribute("users", userRepository.findAll());
        return  "job-search";
    }

}
