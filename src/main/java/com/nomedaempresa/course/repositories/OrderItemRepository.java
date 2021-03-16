package com.nomedaempresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nomedaempresa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
