package com.usermanagement.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public interface UserService {

    public User getUserByUsername(String username);

    public User addUser(User user);

    public User updateUser(User user);

    //todo for nickesh
    //public User addUser(User user);
    //public User updateUser(User user);

    //todo for niraj    
    //public List<User> getAllUsers();
    //public boolean deleteUser(User user);
}
