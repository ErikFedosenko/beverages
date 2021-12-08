package com.example.beverages.products.entity;

public interface Calculator {

    int calculateTotal(MoneyBundle enteredMoney);
    MoneyBundle calculateChange(int amountMoneyToReturn);

}
