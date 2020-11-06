package com.example.ecommerce.application.repository;

import com.example.ecommerce.application.model.OrderProduct;
import com.example.ecommerce.application.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
