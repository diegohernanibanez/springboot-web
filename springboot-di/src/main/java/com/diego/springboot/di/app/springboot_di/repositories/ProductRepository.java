package com.diego.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import com.diego.springboot.di.app.springboot_di.models.Product;

public class ProductRepository {

    private final List<Product> data;

    public ProductRepository() {
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

    public List<Product> findAll(){
        return data;
    }

    public Product findById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
