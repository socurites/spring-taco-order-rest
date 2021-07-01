package com.socurites.taco.order.repository;

import com.socurites.taco.order.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>{
}
