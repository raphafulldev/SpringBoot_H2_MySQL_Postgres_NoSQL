package com.devsuperior.aulacamadas.sercices;

import com.devsuperior.aulacamadas.dto.UserDTO;
import com.devsuperior.aulacamadas.entities.User;
import com.devsuperior.aulacamadas.repositoriues.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO findById (Long id){
        User entity = userRepository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }



}
