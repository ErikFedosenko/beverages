package com.example.beverages.products.repository;

import com.example.beverages.products.entity.Beverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Beverage,Integer> {
}
