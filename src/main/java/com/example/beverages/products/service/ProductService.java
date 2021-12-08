package com.example.beverages.products.service;

import com.example.beverages.products.repository.ProductRepository;
import com.example.beverages.products.entity.Beverage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Beverage> list(){
        return productRepository.findAll();
    }

    public void add(Beverage beverage) {
         productRepository.save(beverage);
    }

    public void delete(Integer beverageId) {
        productRepository.deleteById(beverageId);
    }

    public void update(Beverage beverage) {
        Optional<Beverage> row = productRepository.findById(beverage.getId());
        if (row.isPresent()){
            Beverage product = row.get();
            if (!beverage.getName().isEmpty()){
                product.setName(beverage.getName());
            }
            if (beverage.getPrice() != 0){
                product.setPrice(beverage.getPrice());
            }
            productRepository.save(product);
        }

    }
}
