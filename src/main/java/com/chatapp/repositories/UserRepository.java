package com.chatapp.repositories;

import com.chatapp.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserNameAndPassword(String userName, String password);

    @Override
    ArrayList<User> findAll();
}
