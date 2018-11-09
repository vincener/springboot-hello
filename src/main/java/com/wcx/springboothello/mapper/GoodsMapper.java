package com.wcx.springboothello.mapper;

import com.wcx.springboothello.entity.GoodsEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/10/16.
 */
public interface GoodsMapper {

    @Select("SELECT * FROM tb_goods")
    @Results({
            @Result(property = "goodsId",  column = "goods_id")
    })
    List<GoodsEntity> getAlls();
    @Insert("INSERT INTO tb_goods(name,intro,price,num) VALUES(#{name}, #{intro}, #{price}, #{num})")
    void inserts(GoodsEntity goods);


    List<GoodsEntity> getAll();

    GoodsEntity getOne(Long id);

    void insert(GoodsEntity user);

    void update(GoodsEntity user);

    void delete(Long id);
}
