package com.diego.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.diego.springboot.di.app.springboot_di.models.Product;

@Primary
@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository{

    private final List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
            new Product(1l, "Teclado Gamer", 200l),
            new Product(2l, "Mouse", 500l),
            new Product(3l, "Parlantes", 600l),
            new Product(4l, "Camara web", 800l),
            new Product(5l, "Joystick", 540l),
            new Product(6l, "Microfono", 340l),
            new Product(7l, "Teclado", 120l)
        );
    }
    
    @Override
    public List<Product> findAll(){
        return data;
    }

    @Override
    public Product findById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
