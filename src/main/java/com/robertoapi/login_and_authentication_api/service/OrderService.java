package com.robertoapi.login_and_authentication_api.service;

import com.robertoapi.login_and_authentication_api.model.Order;
import com.robertoapi.login_and_authentication_api.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

//------------------------------------------------------------------------------------------

    public void createOrder(Order order){
        orderRepository.save(order);
    }


    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }




}
