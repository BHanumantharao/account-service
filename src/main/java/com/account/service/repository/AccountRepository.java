package com.account.service.repository;


import com.hanu.cloud.commons.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hanumantharao Bitragunta
 */

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
