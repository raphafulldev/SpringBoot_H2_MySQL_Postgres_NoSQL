package com.devsuperior.myfristproject.services;

import com.devsuperior.myfristproject.entities.Product;
import com.devsuperior.myfristproject.repositories.ProductRepository;
import com.devsuperior.myfristproject.services.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Product findById(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Id not found " + id));
    }
}
