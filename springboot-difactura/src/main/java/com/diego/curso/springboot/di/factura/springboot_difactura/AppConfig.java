package com.diego.curso.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.diego.curso.springboot.di.factura.springboot_difactura.models.Item;
import com.diego.curso.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource(value="classpath:data.properties", encoding="UTF-8")
public class AppConfig {
    
    @Primary
    @Bean
    public List<Item> itemsInvoice() {
        Product p1 = new Product("Camara Sony", 1200l);
        Product p2 = new Product("Camara Cannon", 1500l);

        return Arrays.asList(
            new Item(p1, 1), 
            new Item(p2, 2)
        );
    }
    
    @Bean
    public List<Item> itemsInvoiceOffice() {
        Product p1 = new Product("Escritorio", 700l);
        Product p2 = new Product("Silla", 200l);
        Product p3 = new Product("Tacho", 50l);
        Product p4 = new Product("Monitor", 1000l);

        return Arrays.asList(
            new Item(p1, 5), 
            new Item(p2, 5),
            new Item(p3, 5),
            new Item(p4, 5)
        );
    }
}
