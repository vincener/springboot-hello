package com.wcx.springboothello.controller;

import com.wcx.springboothello.entity.GoodsEntity;
import com.wcx.springboothello.mapper.GoodsMapper;
import com.wcx.springboothello.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/10/16.
 */
@RestController
public class HelloController {
    @Autowired
    private GoodsMapper goodsMapper;

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }


    @RequestMapping("/getGoods")
    public List<GoodsEntity> getGoods() {
        List<GoodsEntity> goods = goodsMapper.getAlls();
        return goods;
    }
    @RequestMapping("/getGood")
    public List<GoodsEntity> getGood() {
        List<GoodsEntity> goods = goodsMapper.getAll();
        return goods;
    }

    @RequestMapping("/save")
    public void save(GoodsEntity goods) {

        goodsMapper.insert(goods);
    }




}
