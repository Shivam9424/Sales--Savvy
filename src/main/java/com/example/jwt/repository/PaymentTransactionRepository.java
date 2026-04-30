package com.example.jwt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.entity.PaymentTransaction;

public interface PaymentTransactionRepository extends JpaRepository<PaymentTransaction, Long> {
}
