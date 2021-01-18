package com.upgrad.eshop.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ESHOP_ORDER")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private User user;

//  TODO: Define the 'Product' field with reference to the Product entity and use the necessary relationship annotation
    @ManyToOne
    private Product product;
//  TODO: Define the 'shippingAddress' field with reference to the ShippingAddress entity and use the necessary relationship annotation
    @ManyToOne
    private ShippingAddress shippingAddress;
    private Double amount;
    private LocalDateTime orderDate = LocalDateTime.now();

//  TODO: Generate getters & setters and constructors for the Entity class

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
}
