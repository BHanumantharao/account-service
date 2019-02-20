package com.account.service.repository;

import com.account.service.processor.AccountProcessor;
import com.hanu.cloud.commons.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hanumantharao Bitragunta
 */
@Service
public class AccountServiceImpl implements AccountProcessor {

    @Autowired
    AccountRepository accountrepository;


    @Override
    public Account add(Account account) {
        return accountrepository.save(account);
    }

    @Override
    public List<Account> getAll() {
        return accountrepository.findAll();
    }

    @Override
    public Account getAccount(int Id) {
        return accountrepository.getOne(Id);
    }
}
