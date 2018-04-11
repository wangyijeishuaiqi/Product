package com.wyj.product.pojo;

/**
 * Created by Administrator on 2018/4/9.
 */
public class Catagory {
    private int id;//类型序号
    private String name;//类型名字
    private String explain;//类型状态

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
}
