package com.vthinkDynamics.productService.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vthinkDynamics.productService.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
