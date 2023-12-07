package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.Entity.Account;

public interface AccountService {
Account createAccount(Account ac);
List<Account> getAll();
Optional<Account> getAccount(Long id);
Account deposit(Long id,Double amount);
Account withdraw(Long id,Double amount);
}
