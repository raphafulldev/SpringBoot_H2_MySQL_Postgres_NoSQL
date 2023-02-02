package com.devusuperior.aulaorm;

import com.devusuperior.aulaorm.entities.Department;
import com.devusuperior.aulaorm.entities.Employee;
import com.devusuperior.aulaorm.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

@SpringBootApplication
public class AulaormApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(AulaormApplication.class, args);	}


	@Override
	public void run(String... args) throws Exception {

		Employee e1 = employeeRepository.findById(1L).get();
		System.out.println(e1);

	}
}
