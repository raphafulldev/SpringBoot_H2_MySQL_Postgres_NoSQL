package com.devsuperior.aulacamadas.dto;

import com.devsuperior.aulacamadas.entities.User;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private Long id;
    private String name;

    public UserDTO() {
    }

    public UserDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
