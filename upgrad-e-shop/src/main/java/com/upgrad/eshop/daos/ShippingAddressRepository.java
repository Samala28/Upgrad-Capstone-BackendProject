package com.upgrad.eshop.daos;

import com.upgrad.eshop.entities.Order;
import com.upgrad.eshop.entities.Product;
import com.upgrad.eshop.entities.ShippingAddress;

import java.util.Optional;

public interface ShippingAddressRepository {

    public Optional<ShippingAddress> findByPhone(String phone);
    public Optional<Product> findByOrder(Order order);
}
