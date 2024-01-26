package com.jw.example.controller;

import com.jw.example.models.User;
import com.jw.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RequestMapping("/home")
@RestController
public class HomeController {
    @Autowired
    private UserService userService;

        //    http://localhost:8080/home/users
    @GetMapping("/users")
    public List<User> getUser() {
        System.out.println("Getting User");
        return this.userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }

}
