package com.example.account_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.account_service.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {}