package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Account;
import com.example.repositary.AccountRepositary;

@Service
public class AccountImpl implements AccountService{
@Autowired
private AccountRepositary acrep;

	@Override
	public Account createAccount(Account ac) {
		
		return acrep.save(ac);
	}
	
	@Override
	public List<Account> getAll() {
		
		return acrep.findAll();
	}
	
	@Override
	public Optional<Account> getAccount(Long id) {
		return acrep.findById(id);
		
	}

	@Override
	public Account deposit(Long id, Double amount) {
		Account acc=getAccount(id).orElseThrow(()-> new RuntimeException("account Not Found"));
		acc.setAmount(acc.getAmount()+amount);
		return acrep.save(acc);
	}

	@Override
	public Account withdraw(Long id, Double amount) {
		Account acc=getAccount(id).orElseThrow(()-> new RuntimeException("account Not Found"));
		acc.setAmount(acc.getAmount()-amount);
		return acrep.save(acc);
	}

	

}
