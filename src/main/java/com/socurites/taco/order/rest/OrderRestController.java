package com.socurites.taco.order.rest;

import com.socurites.taco.order.model.Order;
import com.socurites.taco.order.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/orders")
public class OrderRestController {
    private static final Logger log = LoggerFactory.getLogger(OrderRestController.class);

    private final OrderRepository orderRepository;

    public OrderRestController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public Order processOrder(@RequestBody Order order,
                              HttpSession session) {
        log.info("sessionId: " + session.getId());
        log.info("Order submitted: " + order);

        Order saved = orderRepository.save(order);
        return saved;
    }
}
