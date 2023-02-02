package com.devsuperior.enumspring.repositories;

import com.devsuperior.enumspring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
