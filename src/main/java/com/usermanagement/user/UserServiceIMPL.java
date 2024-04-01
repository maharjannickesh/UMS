package com.usermanagement.user;

import org.hibernate.NonUniqueResultException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceIMPL implements UserService {


    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ResponseEntity<User> getUserByUsername(String username) {
        Optional<UserEntity> userEntity =  userRepository.findByUserName(username);
        if (userEntity.isPresent()) {
            return ResponseEntity.ok( modelMapper.map(userEntity, User.class));
        }
        throw new NoSuchElementException("User " + username + " does not exist in database");
    }

    @Override
    public ResponseEntity<User>  addUser(User user) {
        return ResponseEntity.ok( modelMapper.map(userRepository.save(modelMapper.map(user, UserEntity.class)), User.class) );
    }

    @Override
    public ResponseEntity<User>  updateUser(User user) {

        Optional<UserEntity> userEntity = userRepository.findByUserName(user.getUserName());

        if (userEntity.isPresent()) {
            return ResponseEntity.ok( modelMapper.map(userRepository.save(modelMapper.map(user, UserEntity.class)), User.class));
        }

        throw new NoSuchElementException("User " + user.getUserName() + " does not exist in database");
    }


}
