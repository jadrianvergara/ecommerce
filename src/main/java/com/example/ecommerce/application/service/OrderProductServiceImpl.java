package com.example.ecommerce.application.service;

import com.example.ecommerce.application.model.OrderProduct;
import com.example.ecommerce.application.repository.OrderProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImpl(OrderProductRepository orderProductRepository){
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct){
        return this.orderProductRepository.save(orderProduct);
    }

}
