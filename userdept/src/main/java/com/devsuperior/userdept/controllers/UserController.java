package com.devsuperior.userdept.controllers;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    private ResponseEntity<List<User>> findAll() {
        List<User> list = userRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userRepository.findById(id).get();
        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    private ResponseEntity<User> isert(@RequestBody User obj) {
        User user = userRepository.save(obj);
        return ResponseEntity.ok().body(user);
    }
}
