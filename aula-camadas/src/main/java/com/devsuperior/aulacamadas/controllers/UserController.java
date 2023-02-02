package com.devsuperior.aulacamadas.controllers;

import com.devsuperior.aulacamadas.dto.UserDTO;
import com.devsuperior.aulacamadas.sercices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping(value = "/{id}")
    public UserDTO findById (@PathVariable Long id){
        return userService.findById(id);
    }
}
