package com.diego.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.diego.springboot.di.app.springboot_di.models.Product;

@Repository("productFoo")
public class ProductRepositoryFoo implements ProductRepository{

    private final List<Product> data;

    public ProductRepositoryFoo() {
        this.data = Arrays.asList(new Product(8l, "Monitor Asus", 600l));
    }

    @Override
    public List<Product> findAll() {
        return data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

}
