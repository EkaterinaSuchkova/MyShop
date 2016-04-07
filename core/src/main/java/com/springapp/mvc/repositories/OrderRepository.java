package com.springapp.mvc.repositories;

import com.springapp.mvc.common.GoodInfo;

/**
 * Created by Катя on 26.03.2016.
 */
public interface OrderRepository{
    void addInOrder(GoodInfo goodInfo);
    void deleteFromOrder(Long goodId);
}
