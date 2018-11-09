package com.wcx.springboothello.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/16.
 */
public class GoodsEntity implements Serializable {
    private Long goodsId;

    private String name;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    private  String intro;

    private String price;

    private  Integer num;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
