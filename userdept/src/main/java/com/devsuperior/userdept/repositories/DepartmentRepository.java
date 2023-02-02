package com.devsuperior.userdept.repositories;

import com.devsuperior.userdept.entities.Department;
import com.devsuperior.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
