package com.wyj.product.pojo;

/**
 * Created by Administrator on 2018/4/9.
 */
public class Product {
    private int id;//产品序号
    private String productname;//产品名称
    private String descs;//产品描述
    private int cid;//产品类型
    private Catagory catagory;//类型对象

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
