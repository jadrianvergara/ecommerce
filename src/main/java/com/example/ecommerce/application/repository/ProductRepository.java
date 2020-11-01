package com.example.ecommerce.application.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.ecommerce.application.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
