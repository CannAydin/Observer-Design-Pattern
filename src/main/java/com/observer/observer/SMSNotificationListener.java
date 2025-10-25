package com.observer.observer;

import com.observer.model.dto.OrderDTO;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SMSNotificationListener {

    @EventListener
    public void SMSSender(OrderDTO order){
        System.out.println("SMS: " + order.getObjId() + " " + order.getPrice());
    }
}
