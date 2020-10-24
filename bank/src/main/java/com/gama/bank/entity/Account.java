package com.gama.bank.entity;

public abstract class Account {
    protected int number;
    protected String name;
    protected Double amount;

    public Account(int number, String name, Double amount) {
        this.number = number;
        this.name = name;
        this.amount = amount;
    }

    public void deposit(Double value) {
        if(value >= 0) {
            this.amount += value;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public Double withdraw(Double value) {
        if(value <= this.amount) {
            this.amount -= value;
            return value;
        } else {
            System.out.println("Saldo insuficiente!");
            return this.getAmount();
        }
    }

    public Double accountIncome() {
        return this.amount * 0.7;
    }

    public Double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                "\nNumber: " + this.number +
                "\nAmount: " + this.amount +
                "\nType: " + this.getType();
    }

    public abstract String getType();

    public abstract void transfer(Account account, Double tranfersAmount);
}
