package com.wyj.product.service.impl;

import com.wyj.product.mapper.ProductMapper;
import com.wyj.product.pojo.Product;
import com.wyj.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/9.
 */
@Service
public class ProductServiceimpl implements ProductService {
    //注入
    @Autowired
    ProductMapper productMapper;

    /**
     * 实现查询并分页
     *
     * @param map
     * @return
     */
    @Override
    public List<Product> productPage(Map<String, Object> map) {
        return productMapper.productPage(map);
    }

    /**
     * 实现查询产品总数量
     *
     * @return
     */
    @Override
    public int productCount() {
        return productMapper.productCount();
    }

    /**
     * 实现新增产品
     *
     * @param product
     * @return
     */
    @Override
    public int addproduct(Product product) {
        return productMapper.addproduct(product);
    }

    /**
     * 实现删除商品
     *
     * @param id
     * @return
     */
    @Override
    public int delproduct(int id) {
        return productMapper.delproduct(id);
    }
}
