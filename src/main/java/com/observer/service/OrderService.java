package com.observer.service;

import com.observer.model.dto.OrderDTO;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class OrderService {

    public void publish(OrderDTO orderDto){
        System.out.println(orderDto.getObjId() + " sipariş alındı" + orderDto.getPrice());
    }
}
