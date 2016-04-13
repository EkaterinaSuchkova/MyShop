package com.springapp.mvc.repositories;

import com.springapp.mvc.common.CartInfo;
import com.springapp.mvc.common.GoodInfo;

import java.util.List;

/**
 * Created by ���� on 26.03.2016.
 */
public interface CartRepository {
    /**
     * ���������� ������-������� � ��
     */
    void addInCart(CartInfo cartInfo);
    /**
     * �������� ������-������� �� �� �� �� id
     */
    void deletetFromCart(Long cartId);
    /**
     * �������� ������-������� �� �� �� id ������
     */
    void deleteFromCartByGoodId(Long goodId);
    /**
     * ���������� ������-�������
     */
    void update(CartInfo cartInfo);
    /**
     * ��������� ���� ������� �� ������� ������
     */
    public List<CartInfo> getAll();
    /**
     * �������� ������-������� �� �� �� ���������� id ������
     */
    public List<CartInfo> getByGoodId(Long goodId);
    /**
     * �������� ������-������� �� �� � ����� � ��������� id
     */
    public List<CartInfo> getByUserId(Long userId);
    /**
     * �������� ���������� � ������ �������� �� ������� ������ � ������� ������� �� id ������
     */
    public List<GoodInfo> getGoodByGoodIdFromCart(Long goodId);

}
