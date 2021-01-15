package com.amrindersingh.paymentservice.config.actions;

import com.amrindersingh.paymentservice.domain.PaymentEvent;
import com.amrindersingh.paymentservice.domain.PaymentState;
import com.amrindersingh.paymentservice.services.PaymentServiceImpl;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PreAuthApprovedAction implements Action<PaymentState, PaymentEvent> {
    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> context) {
        System.out.println("Sending Notification of PreAuth Approved");
    }
}