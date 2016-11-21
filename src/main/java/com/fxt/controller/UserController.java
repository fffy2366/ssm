package com.fxt.controller;

import com.fxt.pojo.User;
import com.fxt.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {  
    @Autowired
    private IUserService userService;

    @RequestMapping("/showUser/{id}")
    public String toIndex(HttpServletRequest request,Model model,@PathVariable String id){
        int userId = Integer.parseInt(id);
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
    @RequestMapping("/test")
    public String test(){
        return "test" ;

    }
}  