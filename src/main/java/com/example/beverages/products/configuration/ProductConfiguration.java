package com.example.beverages.products.configuration;

import com.example.beverages.products.entity.Beverage;
import com.example.beverages.products.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(ProductRepository productRepository){

        return args -> {
            productRepository.saveAll(List.of(
                    new Beverage("Coffee",6),
                    new Beverage("Coke",10),
                    new Beverage("Pepsi",12),
                    new Beverage("Soda",8),
                    new Beverage("Tea",4)

            ));
        };

    }

}
