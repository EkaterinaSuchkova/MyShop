package com.springapp.mvc.repositories;

import com.springapp.mvc.common.GoodInfo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Gataullin Kamil
 * 07.03.2016 0:17
 */
public interface GoodRepository {

    void addGood(GoodInfo goodInfo);

    void updateGood(GoodInfo goodInfo);

    void deleteGood(Long goodId);

    GoodInfo getGoodById(Long goodId);

    public List<GoodInfo> getAllGoods();

    public List<GoodInfo> getSaleGoods(String status);

    public List<GoodInfo> getGoodByCategoryId(Long categoryId);

    public List<GoodInfo> getGoodByColorAndSize(String color, String size);

    public List<GoodInfo> getGoodByColor(String color);

    public List<GoodInfo> getGoodBySize(String size);

    public List<GoodInfo> getByPrice(BigDecimal minPrice, BigDecimal mixPrice);

    public List<GoodInfo> getGoodByColorAndSizeAndPrice(String color, String size,BigDecimal minPrice, BigDecimal mixPrice);

}
