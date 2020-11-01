package com.example.ecommerce.application.controller;

import com.example.ecommerce.application.model.Product;
import com.example.ecommerce.application.service.ProductService;
import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping(value={"","/"})
    public @NotNull Iterable<Product> getProducts(){
        return productService.getAllProducts();
    }

}
