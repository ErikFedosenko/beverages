package com.example.beverages.products.entity;

public class MoneyBundle {

        public int number25CentsCoins;

        public int number50CentsCoins;

        public int number1DollarBill;

        public int number2DollarBill;

        public int number5DollarBill;

        public int number10DollarBill;

        public int number20DollarBill;


        public MoneyBundle(int [] enteredMoney) {
            this.number25CentsCoins = enteredMoney[0];
            this.number50CentsCoins = enteredMoney[1];
            this.number1DollarBill = enteredMoney[2];
            this.number2DollarBill = enteredMoney[3];
            this.number5DollarBill = enteredMoney[4];
            this.number10DollarBill = enteredMoney[5];
            this.number20DollarBill = enteredMoney[6];

        }

        public int getTotal(){
            int total = 0;
            total = total+this.number25CentsCoins*Money.TWENTY_FIVE_CENTS.getValue();
            total = total+this.number50CentsCoins*Money.FIFTY_CENTS.getValue();
            total = total+this.number1DollarBill*Money.ONE_DOLLAR.getValue();
            total = total+this.number2DollarBill*Money.TWO_DOLLARS.getValue();
            total = total+this.number5DollarBill*Money.FIVE_DOLLARS.getValue();
            total = total+this.number10DollarBill*Money.TEN_DOLLARS.getValue();
            total = total+this.number20DollarBill*Money.TWENTY_DOLLARS.getValue();
            return total;
        }

    }

