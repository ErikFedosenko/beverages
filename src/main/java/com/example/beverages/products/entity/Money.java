package com.example.beverages.products.entity;

public enum Money {
    TWENTY_FIVE_CENTS(25), FIFTY_CENTS(50),ONE_DOLLAR(100),TWO_DOLLARS(200),
    FIVE_DOLLARS(500),TEN_DOLLARS(1000),TWENTY_DOLLARS(2000);

    private int value;

    Money(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
