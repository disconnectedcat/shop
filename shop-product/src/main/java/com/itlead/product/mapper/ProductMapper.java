package com.itlead.product.mapper;


import com.itlead.common.domain.Product;

public interface ProductMapper {
    Product selectProductWithId(Integer id);
}
