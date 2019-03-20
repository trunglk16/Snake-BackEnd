package com.codegym.snake.repository;

import com.codegym.snake.model.Role;
import com.codegym.snake.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
