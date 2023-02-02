package com.devsuperior.myfristproject.resources;

import com.devsuperior.myfristproject.entities.Category;
import com.devsuperior.myfristproject.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    @Autowired
    private CategoryRepository repository;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = repository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category cat = repository.findById(id).get(); //.get() vai obter o objeto dentro do optional.
        return ResponseEntity.ok().body(cat);
    }
}
