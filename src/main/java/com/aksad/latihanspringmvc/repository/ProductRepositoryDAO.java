package com.aksad.latihanspringmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aksad.latihanspringmvc.model.Product;

public interface ProductRepositoryDAO extends JpaRepository<Product, Long>{

}
