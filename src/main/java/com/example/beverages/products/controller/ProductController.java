package com.example.beverages.products.controller;

import com.example.beverages.products.service.ProductService;
import com.example.beverages.products.entity.Beverage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beverages")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Beverage> list(){
        return productService.list();
    }

    @PostMapping("/product")
    public List<Beverage> add(@RequestBody Beverage beverage){
        productService.add(beverage);
        return productService.list();
    }


    @DeleteMapping("/product/{beverageId}")
    public void delete(@PathVariable Integer beverageId){
        productService.delete(beverageId);
    }

    @PutMapping("/product")
    public void delete(@RequestBody Beverage beverage){
         productService.update(beverage);
    }

}
