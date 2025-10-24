package com.observer.controller;

import com.observer.model.dto.OrderDTO;
import com.observer.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {
    final private OrderService orderService;

    @PostMapping("order")
    public void order(@RequestBody OrderDTO orderDTO){
        orderService.publish(orderDTO);
    }

}
