package com.osttra.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.osttra.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

	@Query("SELECT p FROM Product p WHERE p.price >:customvalue ")
	List<Product> findProductGreaterThanValue(double customvalue);
	
	@Query("SELECT p FROM Product p WHERE p.price BETWEEN :firstvalue AND :endvalue ")
	List<Product> findProductBetweenRange(double firstvalue,double endvalue);
	
	
	
}

