package com.usermanagement.user;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceIMPL implements UserService {


    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public User getUserByUsername(String username) {
        Optional<UserEntity> userEntity = userRepository.findByUserName(username);
        return modelMapper.map(userEntity, User.class);
    }

    @Override
    public User addUser(User user) {
          return modelMapper.map(userRepository.save(modelMapper.map(user, UserEntity.class)), User.class);
    }

    @Override
    public User updateUser(User user) {


        Optional<UserEntity> userEntity = userRepository.findByUserName(user.getUserName());

        if(userEntity.isPresent()){
         return modelMapper.map(userRepository.save(modelMapper.map(user, UserEntity.class)), User.class);
        }

        return null;
    }


}
