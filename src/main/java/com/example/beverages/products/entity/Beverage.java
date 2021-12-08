package com.example.beverages.products.entity;

import javax.persistence.*;

@Entity
public class Beverage {

    @Id
    @SequenceGenerator(name = "beverage_sequence", sequenceName = "beverage_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "beverage_sequence")
    private Integer id;

    private String name;
    private int price;

    public Beverage() {

    }

    public Beverage(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
