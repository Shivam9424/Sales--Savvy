package com.example.jwt.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.entity.PurchaseOrder;
import com.example.jwt.entity.User;


public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
    Optional<PurchaseOrder> findByIdAndUser(Long id, User user);
}