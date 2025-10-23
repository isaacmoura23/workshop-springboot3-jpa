package com.project.course.repository;

import com.project.course.entities.Category;
import com.project.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
