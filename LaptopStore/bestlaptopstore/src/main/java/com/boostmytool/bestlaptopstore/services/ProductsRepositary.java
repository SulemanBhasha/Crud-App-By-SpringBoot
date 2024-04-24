package com.boostmytool.bestlaptopstore.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boostmytool.bestlaptopstore.models.Product;

public interface ProductsRepositary  extends JpaRepository<Product, Integer>{

	List<Product> findAll();

}
