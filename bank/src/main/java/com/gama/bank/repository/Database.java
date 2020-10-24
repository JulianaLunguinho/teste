package com.gama.bank.repository;

import com.gama.bank.entity.Account;

import java.util.Hashtable;

public enum Database {
    INSTANCE;

    private final Hashtable<String, Account> account;

    Database() {
        account = new Hashtable<>();
    }

    public Hashtable account() {
        return this.account;
    }
}
