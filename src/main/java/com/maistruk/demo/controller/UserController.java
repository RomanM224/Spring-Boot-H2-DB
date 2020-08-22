package com.maistruk.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.maistruk.demo.dao.UserRepository;
import com.maistruk.demo.model.User;

@Controller
public class UserController {
    
    @Autowired
    UserRepository repo;
    
    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }
    
    @RequestMapping("/addUser")
    public String addUser(User user) {
        repo.save(user);
        return "home.jsp";
    }
    
    @RequestMapping("/users")
    @ResponseBody
    public List<User> getUsers() {
        
        return repo.findAll();
    }
    
    @RequestMapping("/users/{id}")
    @ResponseBody
    public Optional<User> getUser(@PathVariable("id") int id) {
        
        return repo.findById(id);
    }
    

    
    
    @RequestMapping("/getUser")
    public ModelAndView getUser(@RequestParam("id") Integer id) {
        
        ModelAndView modelAndView = new ModelAndView("showUser.jsp");
        User user = repo.findById(id).orElse(new User());
        
        System.out.println(repo.findByLang("Java"));
        System.out.println(repo.findByIdGreaterThan(102));
        System.out.println(repo.findByLangSorted("Java"));
        
        modelAndView.addObject(user);
        return modelAndView;
    }

}
