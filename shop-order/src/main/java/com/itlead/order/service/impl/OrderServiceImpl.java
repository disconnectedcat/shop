package com.itlead.order.service.impl;



import com.itlead.common.domain.Order;
import com.itlead.common.domain.Product;
import com.itlead.order.mapper.OrderMapper;
import com.itlead.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;



    @Override
    public Order getOrderById(Integer id) {
        Order order = orderMapper.selectOrderWithId(id);

        return order;
    }




}
