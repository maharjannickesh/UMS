package com.usermanagement.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("test")
    public String testController(){
        return "It Works";
    }

    @GetMapping("{username}")
    public User getUserByUsername(@PathVariable String username){
        return  userService.getUserByUsername(username);
    }

}
