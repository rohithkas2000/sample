package com.training.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
