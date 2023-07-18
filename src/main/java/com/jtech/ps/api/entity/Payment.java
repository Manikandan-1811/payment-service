package com.jtech.ps.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("payment")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Payment {
    private String paymentStatus;
    private String transactionId;
    private int orderId;
    private double amount;
}
