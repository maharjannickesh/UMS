package com.usermanagement.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;


@RestController
@RequestMapping("/user")
public class UserController {

    //swagger
    //slflog4j

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

    @PostMapping()
    public User addUser(@RequestBody  User user){
        return userService.addUser(user);
    }

    @PutMapping()
    public User updateUser(@RequestBody  User user){
        return userService.updateUser(user);
    }

}
