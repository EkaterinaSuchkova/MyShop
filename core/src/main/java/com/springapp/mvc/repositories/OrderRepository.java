package com.springapp.mvc.repositories;

import com.springapp.mvc.common.GoodInfo;

/**
 * Created by Катя on 26.03.2016.
 */
public interface OrderRepository{
    /**
     * Добавление товара в таблицу заказов
     */
    void addInOrder(GoodInfo goodInfo);
    /**
     * Удаление товара из заказа по id товара
     */
    void deleteFromOrder(Long goodId);
}
