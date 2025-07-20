package com.example.account_service.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String email;
    private String accountType;
    private LocalDate createdAt = LocalDate.now();
    public Long getId() {
        return id;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getAccountType() {
        return accountType;
    }
    public LocalDate getCreatedAt() {
        return createdAt;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    
}