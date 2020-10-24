package com.gama.bank.controller;

import com.gama.bank.entity.Account;
import com.gama.bank.entity.CheckingAccount;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController("/checking")
public class CheckingAccountController {

    @PostMapping("/create")
    public HttpResponse<Account> newAccount() {
        Account account = new CheckingAccount(1, "name", 100.0);
        return HttpResponse.ok(account);
    }
}
