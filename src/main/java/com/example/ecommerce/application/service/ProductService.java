package com.example.ecommerce.application.service;

import com.example.ecommerce.application.model.Product;
import com.sun.istack.NotNull;

import javax.validation.constraints.Min;

public interface ProductService {

    @NotNull Iterable<Product> getAllProducts();

    Product getProduct(@Min(value = 1L, message = "Invalid product ID.") long id);

    Product save(Product product);


}
