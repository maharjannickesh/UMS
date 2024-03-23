package com.usermanagement.user;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public ResponseEntity<User> getUserByUsername(String username);

    public ResponseEntity<User> addUser(User user);

    public ResponseEntity<User> updateUser(User user);

    //todo for nickesh
    //public User addUser(User user);
    //public User updateUser(User user);

    //todo for niraj    
    //public List<User> getAllUsers();
    //public boolean deleteUser(User user);
}
