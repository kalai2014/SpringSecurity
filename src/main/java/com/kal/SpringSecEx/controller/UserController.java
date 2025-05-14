package com.kal.SpringSecEx.controller;

import com.kal.SpringSecEx.model.Users;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @RequestMapping("/register")
    public Users register(@RequestBody Users users){
        return
    }

}
