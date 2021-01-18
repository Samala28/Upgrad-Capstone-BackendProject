package com.upgrad.eshop.daos;

import com.upgrad.eshop.entities.Order;
import com.upgrad.eshop.entities.User;

import java.util.Optional;

public interface OrderRepository {

    public Optional<Order> findByOrderId(Long id);
    public Optional<Order> findOrderByUserEmail(String email);
    public Optional<Order> findOrderByUserId(Long id);
}
