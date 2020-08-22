package com.maistruk.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maistruk.demo.dao.UserRepository;
import com.maistruk.demo.model.User;

//@org.springframework.web.bind.annotation.RestController
//public class RestController {
//    
//    @Autowired
//    UserRepository userRepository;
//    
//    @RequestMapping("/")
//    public String home() {
//        return "home.jsp";
//    }
//    
//    @PostMapping("/user")
//    @ResponseBody
//    public User addUser(User user) {
//        
//        userRepository.save(user);
//        return user;
//    }
//
//}
