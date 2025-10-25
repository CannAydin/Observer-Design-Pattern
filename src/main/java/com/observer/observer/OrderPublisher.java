package com.observer.observer;

import com.observer.model.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderPublisher {
    final private ApplicationEventPublisher publisher;

    // Before Spring 4,2
    public void publishOrder(OrderDTO order){
        publisher.publishEvent(new OrderCreatedEvent(this, order));
    }

    // After Spring 4,2
    public void publishEvent(OrderDTO order){
        publisher.publishEvent(order);
    }
}
