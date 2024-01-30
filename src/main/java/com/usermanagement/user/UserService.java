package com.usermanagement.user;

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
