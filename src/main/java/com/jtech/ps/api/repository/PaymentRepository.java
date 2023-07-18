package com.jtech.ps.api.repository;

import com.jtech.ps.api.entity.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * Payment repository interface for retrieve payment info from table.
 *
 * @author Manikandan
 */
public interface PaymentRepository extends MongoRepository<Payment,Integer> {
    @Query("{orderId :?0}")
    Payment findByOrderId(int orderId);
}
