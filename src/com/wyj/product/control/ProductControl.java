package com.wyj.product.control;

import com.wyj.product.pojo.Product;
import com.wyj.product.service.ProductService;
import com.wyj.product.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/9.
 */
@Controller
public class ProductControl {
    Map<String, Object> map;
    //查询并分页
    @Autowired
    ProductService productService;

    @RequestMapping("/index")
    public ModelAndView productfind(ModelAndView modelAndView, Page page) {
        //实现hashmap
        map = new HashMap<>();
        //实现查询总数据
        int count = productService.productCount();
        //给分页总数赋值
        page.setPageCount(count);
        //给map的键pageNo赋值
        map.put("pageNo", (page.getPageNo() - 1) * page.getPageSize());
        //给map的键pageSize赋值
        map.put("pageSize", page.getPageSize());
        //实现查询并分页
        List<Product> products = productService.productPage(map);
        //给当前数据赋值
        page.setProducts(products);
        //传数据给前台
        modelAndView.addObject("page", page);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    //删除产品
    @RequestMapping("/delProduct")
    public ModelAndView delProduct(int id, ModelAndView modelAndView) {
        //实现删除
        int count = productService.delproduct(id);

        if (count > 0) {
            modelAndView.setViewName("redirect:index");
        } else {
            modelAndView.setViewName("redirect:index");
        }
        return modelAndView;
    }

    //点击跳转新增页面
    @RequestMapping("/add")
    public String add() {
        return "add";
    }


    //新增产品
    @RequestMapping("/addProduct")
    public ModelAndView addProduct(ModelAndView modelAndView, Product product) {
        //实现新增
        int count = productService.addproduct(product);
        if (count > 0) {
            modelAndView.setViewName("redirect:index");
        } else {
            modelAndView.setViewName("add");

        }
        return modelAndView;
    }
}
