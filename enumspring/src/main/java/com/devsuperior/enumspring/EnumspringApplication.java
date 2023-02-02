package com.devsuperior.enumspring;

import com.devsuperior.enumspring.entities.Order;
import com.devsuperior.enumspring.enums.OrderStatus;
import com.devsuperior.enumspring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Arrays;

@SpringBootApplication
public class EnumspringApplication implements CommandLineRunner {
	@Autowired
	private OrderRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(EnumspringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order o1 = new Order(null, Instant.parse("2021-12-20T21:04:00Z"), OrderStatus.PAID);
		Order o2 = new Order(null, Instant.parse("2022-01-23T22:05:07Z"), OrderStatus.WAITING_PAYMENT);
		Order o3 = new Order(null, Instant.parse("2022-01-24T12:15:07Z"), OrderStatus.WAITING_PAYMENT );
		Order o4= new Order(null, Instant.parse("2022-01-24T12:15:07Z"), OrderStatus.DEVOLVIDO );

		repository.saveAll(Arrays.asList(o1,o2,o3,o4));

	}
}
