package com.zlzf.stock.dao;

import com.zlzf.stock.model.entity.Product;

public interface ProductDao {
    int deleteByPrimaryKey(String id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}