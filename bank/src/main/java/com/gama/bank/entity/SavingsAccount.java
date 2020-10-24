package com.gama.bank.entity;

public class SavingsAccount extends Account {

    public SavingsAccount(int number, String name, Double amount) {
        super(number, name, amount);
    }

    @Override
    public String getType() {
        return "SavingsAccount";
    }

    @Override
    public void transfer(Account account, Double tranfersAmount) {
        this.withdraw(tranfersAmount);
        account.deposit(tranfersAmount);
    }
}
