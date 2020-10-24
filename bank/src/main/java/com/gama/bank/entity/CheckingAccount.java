package com.gama.bank.entity;

public class CheckingAccount extends Account {
    Double bonus = 0.10;

    public CheckingAccount(int number, String name, Double amount) {
        super(number, name, amount);
    }

    @Override
    public String getType() {
        return "CheckingAccount";
    }

    @Override
    public void transfer(Account account, Double transfersAmount) {
        this.withdraw(transfersAmount);
        account.deposit(transfersAmount);
    }

    @Override
    public Double withdraw(Double value) {
        if(value <= this.amount) {
            this.amount -= value;
            return value + this.bonus;
        } else {
            System.out.println("Saldo insuficiente!");
            return 0.0;
        }
    }


}
