package com.jtech.ps.api.controller;

import com.jtech.ps.api.entity.Payment;
import com.jtech.ps.api.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for managing payment (Create, get)
 * Annotated with {@link RestController @RestController}, {@link RequestMapping @RequestMapping}.
 *
 * @author Manikandan
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;
    Logger logger = LoggerFactory.getLogger(PaymentController.class);
    @PostMapping("/dopayment")
    public Payment doPayment(@RequestBody Payment payment) {
        logger.info("Payment controller: doPayment() initiated");
        return service.doPayment(payment);
    }
@GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrder(@PathVariable int orderId) {
        logger.info("Payment controller: findPaymentHistoryByOrder() initiated");
        return service.findPaymentHistoryByOrderId(orderId);
    }
}
