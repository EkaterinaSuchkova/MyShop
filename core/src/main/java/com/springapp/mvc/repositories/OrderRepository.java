package com.springapp.mvc.repositories;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.common.OrderInfo;

/**
 * Created by ���� on 26.03.2016.
 */
public interface OrderRepository{
    /**
     * ���������� ������ � ������� �������
     */
    void addInOrder(OrderInfo orderInfo);
    /**
     * �������� ������ �� ������ �� id ������
     */
    void deleteFromOrder(Long goodId);
}
