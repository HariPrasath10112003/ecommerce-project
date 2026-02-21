package com.phegondev.Phegon.Ecommerce.service.interf;

import com.phegondev.Phegon.Ecommerce.dto.OrderRequest;
import com.phegondev.Phegon.Ecommerce.dto.Response;
import com.phegondev.Phegon.Ecommerce.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}
