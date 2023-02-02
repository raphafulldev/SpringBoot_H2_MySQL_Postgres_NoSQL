package com.devsuperior.aulacamadas.repositoriues;

import com.devsuperior.aulacamadas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
