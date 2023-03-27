package com.itlead.order.controller;



import com.itlead.common.domain.Order;
import com.itlead.common.domain.Product;
import com.itlead.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * author cheng
 * date 2022/11/11 9:33
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/find/{id}")
    public Order getOrderById(@PathVariable Integer id) {
        System.out.println(Thread.currentThread().getName());
        Order order = orderService.getOrderById(id);
        Product product = restTemplate.getForObject();
        order.setProduct(product);
        return  orderService.getOrderById(id);

    }

}
