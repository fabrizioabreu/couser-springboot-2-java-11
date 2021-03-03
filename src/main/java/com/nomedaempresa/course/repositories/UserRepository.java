package com.nomedaempresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nomedaempresa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
