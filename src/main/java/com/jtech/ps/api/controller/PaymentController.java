package com.jtech.ps.api.controller;

import com.jtech.ps.api.entity.Payment;
import com.jtech.ps.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;
    @PostMapping("/dopayment")
    public Payment doPayment(@RequestBody Payment payment) {
        return service.doPayment(payment);
    }
@GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrder(@PathVariable int orderId) {
        return service.findPaymentHistoryByOrderId(orderId);
    }
}
