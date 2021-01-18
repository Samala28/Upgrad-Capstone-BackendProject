package com.upgrad.eshop.daos;

import com.upgrad.eshop.entities.Product;
import com.upgrad.eshop.entities.User;

import java.util.Optional;

public interface ProductRepository {

    public Optional<Product> findByProductId(Long id);
    public Optional<Product> findByProductName(String name);

}
