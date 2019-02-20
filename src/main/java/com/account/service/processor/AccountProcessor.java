package com.account.service.processor;

import com.account.service.repository.AccountRepository;
import com.hanu.cloud.commons.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Hanumantharao Bitragunta
 */
@Component
public interface AccountProcessor {

    Account add(Account account);
    List<Account> getAll();
    Account getAccount(int Id);

}
