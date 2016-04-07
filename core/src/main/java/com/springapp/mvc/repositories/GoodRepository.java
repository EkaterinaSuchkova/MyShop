package com.springapp.mvc.repositories;

import com.springapp.mvc.common.GoodInfo;

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

}
