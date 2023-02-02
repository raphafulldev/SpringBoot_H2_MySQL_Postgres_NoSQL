package com.devsuperior.enumspring.resources;

import com.devsuperior.enumspring.entities.Order;
import com.devsuperior.enumspring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderRepository repository;

    @GetMapping
    public ResponseEntity<List<Order>> findall() {
        List<Order> list = repository.findAll();
        return ResponseEntity.ok().body(list);
    }

}
