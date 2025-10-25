package com.observer.service;

import com.observer.model.dto.OrderDTO;
import com.observer.observer.OrderPublisher;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    final private OrderPublisher publisher;

    public void publish(OrderDTO orderDto){
        System.out.println(orderDto.getObjId() + " sipariş alındı" + orderDto.getPrice());
        publisher.publishOrder(orderDto);
        publisher.publishEvent(orderDto);

    }
}
