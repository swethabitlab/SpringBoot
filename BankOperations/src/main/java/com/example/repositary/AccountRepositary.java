package com.example.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Account;

public interface AccountRepositary extends JpaRepository<Account, Long>{

}
