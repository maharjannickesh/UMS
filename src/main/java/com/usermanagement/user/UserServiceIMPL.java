package com.usermanagement.user;

import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService {
    @Override
    public User getUserByUsername(String username) {
        return new User(1, "firstuser", "niraj", "gautam", "nirajgtm@gmail.com","Test@123");
    }
}
