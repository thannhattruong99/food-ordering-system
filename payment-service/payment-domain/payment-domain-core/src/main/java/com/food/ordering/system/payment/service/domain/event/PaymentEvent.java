package com.food.ordering.system.payment.service.domain.event;

import com.food.ordering.system.domain.event.DomainEvent;
import com.food.ordering.system.payment.service.domain.entity.Payment;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.ZonedDateTime;
import java.util.List;

@RequiredArgsConstructor
@Data
public abstract class PaymentEvent implements DomainEvent<Payment> {
    private final Payment payment;
    private final ZonedDateTime createdDate;
    private final List<String> failureMessages;
}
