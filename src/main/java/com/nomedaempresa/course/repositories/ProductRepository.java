package com.nomedaempresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nomedaempresa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
