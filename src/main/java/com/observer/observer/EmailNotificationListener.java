package com.observer.observer;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailNotificationListener {
    @EventListener
    public void emailSender(OrderCreatedEvent event){
        System.out.println("Email: " + event.getOrder().getObjId() + " " + event.getOrder().getPrice());
    }
}
