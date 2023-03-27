package com.itlead.product.controller;



import com.itlead.common.domain.Product;
import com.itlead.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;



    @Value("${server.port}")
    private String serverPort;




    @RequestMapping("/find/{id}")
    public Product getProductById(@PathVariable Integer id) {
        Product product = productService.getProductById(id);
        product.setUrl(serverPort);
        return product;
    }


}
