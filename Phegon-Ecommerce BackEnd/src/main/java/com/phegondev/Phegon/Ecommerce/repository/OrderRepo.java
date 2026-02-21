package com.phegondev.Phegon.Ecommerce.repository;

import com.phegondev.Phegon.Ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
