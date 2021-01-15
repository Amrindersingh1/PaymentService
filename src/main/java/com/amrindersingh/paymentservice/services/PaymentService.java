package com.amrindersingh.paymentservice.services;

import com.amrindersingh.paymentservice.domain.Payment;
import com.amrindersingh.paymentservice.domain.PaymentEvent;
import com.amrindersingh.paymentservice.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}