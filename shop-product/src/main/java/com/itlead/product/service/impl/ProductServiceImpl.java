package com.itlead.product.service.impl;



import com.itlead.common.domain.Product;
import com.itlead.product.mapper.ProductMapper;
import com.itlead.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getProductById(Integer id) {
        return productMapper.selectProductWithId(id);
    }
}
