package com.food.ordering.system.payment.service.domain.event;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.payment.service.domain.entity.Payment;
import lombok.RequiredArgsConstructor;

import java.time.ZonedDateTime;
import java.util.Collections;

public class PaymentCompletedEvent extends PaymentEvent{
    private final DomainEventPublisher<PaymentCompletedEvent> paymentCompletedEventDomainEventPublisher;
    public PaymentCompletedEvent(Payment payment, ZonedDateTime createDat, DomainEventPublisher<PaymentCompletedEvent> paymentCompletedEventDomainEventPublisher) {
        super(payment, createDat, Collections.emptyList());
        this.paymentCompletedEventDomainEventPublisher = paymentCompletedEventDomainEventPublisher;
    }

    @Override
    public void fire() {
        paymentCompletedEventDomainEventPublisher.publish(this);
    }
}
