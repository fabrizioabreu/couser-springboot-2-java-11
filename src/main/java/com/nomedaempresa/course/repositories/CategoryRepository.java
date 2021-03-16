package com.nomedaempresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nomedaempresa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
