package com.kal.SpringSecEx.service;

import com.kal.SpringSecEx.model.Users;
import com.kal.SpringSecEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);

    public Users register(Users user){

        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }
}
