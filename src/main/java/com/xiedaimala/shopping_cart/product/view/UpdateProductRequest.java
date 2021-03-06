package com.xiedaimala.shopping_cart.product.view;

import com.xiedaimala.shopping_cart.product.model.Product;

public class UpdateProductRequest {

    private String name;
    private String description;
    private double price;

    public UpdateProductRequest() {
    }

    public UpdateProductRequest(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product toProduct(Long id) {
        return new Product(id, name, description, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
