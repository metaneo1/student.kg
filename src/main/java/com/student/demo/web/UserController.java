package com.student.demo.web;

import com.student.demo.model.User;
import com.student.demo.repository.UserRepository;
import com.student.demo.service.UserService;
import com.student.demo.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.annotation.SessionScope;

@Controller
@SessionScope
public class UserController {
    User u = UserServiceImpl.signedUser;
    @GetMapping("/profile")
    public String profile(Model model){
        model.addAttribute("name",u.getFirstName()+" "+u.getLastName());
        return  "home4";
    }

}
