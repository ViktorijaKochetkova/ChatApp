package com.chatapp.services;

import com.chatapp.entities.User;
import com.chatapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
     @Autowired //dependency injection
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void createUser(User user) throws Exception {
         this.userRepository.save(user);
    }

}
