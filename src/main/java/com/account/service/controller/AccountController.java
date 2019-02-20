package com.account.service.controller;

import com.account.service.processor.AccountProcessor;
import com.hanu.cloud.commons.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Hanumantharao Bitragunta
 */

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    AccountProcessor accountProcessor;

    @GetMapping(value = "/findAll")
    public List<Account> getAccounts() {
        return accountProcessor.getAll();
    }

    @GetMapping(value = "/find/{Id}")
    public Account getAccount(@PathVariable int Id) {
        return accountProcessor.getAccount(Id);
    }

    @PostMapping(value = "/add")
    public Account saveAccount(@RequestBody Account account){
        return accountProcessor.add(account);
    }

}
