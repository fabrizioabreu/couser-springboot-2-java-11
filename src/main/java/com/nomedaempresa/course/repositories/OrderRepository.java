package com.nomedaempresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nomedaempresa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
