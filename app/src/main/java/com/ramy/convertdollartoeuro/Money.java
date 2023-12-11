package com.ramy.convertdollartoeuro;

public class Money {
    double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public double ConvertDollarToPound(){
        return this.money/50;
    }

    public double ConvertPoundToDollar(){
        return this.money*50;
    }
}
