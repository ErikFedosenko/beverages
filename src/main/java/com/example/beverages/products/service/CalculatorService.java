package com.example.beverages.products.service;

import com.example.beverages.products.entity.Calculator;
import com.example.beverages.products.entity.Money;
import com.example.beverages.products.entity.MoneyBundle;

public class CalculatorService implements Calculator {
    @Override
    public int calculateTotal(MoneyBundle enteredMoney) {
        return enteredMoney.getTotal();
    }

    @Override
    public MoneyBundle calculateChange(int amountMoneyToReturn) {
        MoneyBundle change = new MoneyBundle(new int[5]);
        int remainingAmount = amountMoneyToReturn;
        change.number20DollarBill = remainingAmount / Money.TWENTY_DOLLARS.getValue();
        remainingAmount = remainingAmount % Money.TWENTY_DOLLARS.getValue();

        change.number10DollarBill = remainingAmount / Money.TEN_DOLLARS.getValue();
        remainingAmount = remainingAmount % Money.TEN_DOLLARS.getValue();

        change.number5DollarBill = remainingAmount / Money.FIVE_DOLLARS.getValue();
        remainingAmount = remainingAmount % Money.FIVE_DOLLARS.getValue();

        change.number2DollarBill = remainingAmount / Money.TWO_DOLLARS.getValue();
        remainingAmount = remainingAmount % Money.TWO_DOLLARS.getValue();

        change.number1DollarBill = remainingAmount / Money.ONE_DOLLAR.getValue();
        remainingAmount = remainingAmount % Money.TWO_DOLLARS.getValue();

        change.number50CentsCoins = remainingAmount / Money.FIFTY_CENTS.getValue();
        remainingAmount = remainingAmount % Money.FIFTY_CENTS.getValue();

        change.number25CentsCoins = remainingAmount / Money.TWENTY_FIVE_CENTS.getValue();

        return change;
    }
}
