package com.example.ecommerce.application.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.ecommerce.application.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
