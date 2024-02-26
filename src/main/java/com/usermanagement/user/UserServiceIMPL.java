package com.usermanagement.user;

import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService {
    @Override
    public User getUserByUsername(String username) {
        return new User(1, "firstuser", "niraj", "gautam", "nirajgtm@gmail.com","Test@123");
    }

    @Override
    public User addUser(User user) {
        System.out.println(user.getUserName());
        //add in database
        return new User(user.getUserid(), user.getUserName(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
    }

    @Override
    public User updateUser(User user) {
        User updateuser = getUserByUsername(user.getUserName());
        updateuser.setUserName(user.getUserName());
        updateuser.setEmail(user.getEmail());
        updateuser.setPassword(user.getPassword());
        updateuser.setFirstName("Niraj");
        updateuser.setLastName("Gautam");
        return updateuser;
    }


}
