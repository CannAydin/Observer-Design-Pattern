package com.observer.observer;

import com.observer.model.dto.OrderDTO;
import org.springframework.context.ApplicationEvent;

public class OrderCreatedEvent extends ApplicationEvent {
    private OrderDTO order;
    public OrderCreatedEvent(Object source, OrderDTO order){
        super(source);
        this.order = order;
    }

    public OrderDTO getOrder(){
        return order;
    }
}
