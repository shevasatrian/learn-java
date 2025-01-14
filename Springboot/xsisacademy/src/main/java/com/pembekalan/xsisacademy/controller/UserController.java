package com.pembekalan.xsisacademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pembekalan.xsisacademy.entity.User;
import com.pembekalan.xsisacademy.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public ModelAndView getAllUsers() {
        ModelAndView view = new ModelAndView("user/index");
        List<User> users = userService.getAllUsers();
        String title = "User Page";
        view.addObject("users", users);
        view.addObject("title", title);
        return view;
    }

    @GetMapping("/form")
    public ModelAndView userForm() {
        ModelAndView view = new ModelAndView("user/form");
        User user = new User();
        view.addObject("user", user);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView saveUser(@ModelAttribute User user, BindingResult result) {
        if (!result.hasErrors()) {
            userService.savUser(user);
        }
        return new ModelAndView("redirect:/user");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editUser(@PathVariable Integer id) {
        ModelAndView view = new ModelAndView("user/form");
        User user = userService.getUserById(id);
        view.addObject("user", user);
        return view;
    }
    
    @GetMapping("/delete/{id}")
    public ModelAndView deleteUser(@PathVariable Integer id) {
        userService.deleteUserById(id);
        return new ModelAndView("redirect:/user");
    }
    
    
    
    
}
