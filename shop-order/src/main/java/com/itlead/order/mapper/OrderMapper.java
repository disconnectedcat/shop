package com.itlead.order.mapper;


import com.itlead.common.domain.Order;

public interface OrderMapper {
    Order selectOrderWithId(Integer id);

    void insertOrder(Order order);
}
