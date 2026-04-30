package com.example.jwt.dto;

public record CreatePaymentOrderResponse(
        Long localOrderId,
        String razorpayOrderId,
        long amount,
        String currency,
        String keyId
) {
}