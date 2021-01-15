package com.amrindersingh.paymentservice.config.guards;

import com.amrindersingh.paymentservice.domain.PaymentEvent;
import com.amrindersingh.paymentservice.domain.PaymentState;
import com.amrindersingh.paymentservice.services.PaymentServiceImpl;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.guard.Guard;
import org.springframework.stereotype.Component;

@Component
public class PaymentIdGuard implements Guard<PaymentState, PaymentEvent> {

    @Override
    public boolean evaluate(StateContext<PaymentState, PaymentEvent> context) {
        return context.getMessageHeader(PaymentServiceImpl.PAYMENT_ID_HEADER) != null;
    }
}