package com.amrindersingh.paymentservice.repository;

import com.amrindersingh.paymentservice.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
