package com.wyj.product.service;

import com.wyj.product.pojo.Product;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/9.
 */
public interface ProductService {

    /**
     * 读取查询并分页
     *
     * @param map
     * @return
     */
    List<Product> productPage(Map<String, Object> map);

    /**
     * 读取查询产品总数据
     *
     * @return
     */
    int productCount();

    /**
     * 读取新增产品
     *
     * @param product
     * @return
     */
    int addproduct(Product product);

    /**
     * 删除产品
     *
     * @param id
     * @return
     */
    int delproduct(int id);
}
