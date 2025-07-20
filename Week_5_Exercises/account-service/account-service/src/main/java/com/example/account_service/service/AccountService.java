package com.example.account_service.service;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.account_service.model.Account;
import com.example.account_service.repository.AccountRepository;

@Service
public class AccountService {
    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account createAccount(Account acc) {
        return repository.save(acc);
    }

    public Optional<Account> getAccount(Long id) {
        return repository.findById(id);
    }
}