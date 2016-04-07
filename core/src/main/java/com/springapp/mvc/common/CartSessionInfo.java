package com.springapp.mvc.common;

import java.util.Map;

/**
 * Created by ���� on 04.04.2016.
 */
public class CartSessionInfo {

    /**
     * key - id ������, value - ���-�� ������
     */
    private Map<Long, Integer> goods;

    public Map<Long, Integer> getGoods() {
        return goods;
    }

    public void setGoods(Map<Long, Integer> goods) {
        this.goods = goods;
    }

    /**
     * �������� ���-�� ������ � �������
     * ��� FreeMarker, ��� ��� �� �� ����� �������� � ��������� �������
     *
     * @param goodId id ������
     * @return ���-�� ������ � �������
     */
    public Integer getCount(Long goodId) {
        if (goods == null || goodId == null)
            return null;
        return goods.get(goodId);
    }

    /**
     * ���� �� � ������� ����� � ���� id
     * ��� FreeMarker, ��� ��� �� �� ����� �������� � ��������� �������
     *
     * @param goodId id ������
     */
    public boolean containsGoodId(Long goodId){
        if (goods == null || goodId == null)
            return false;
        return goods.containsKey(goodId);
    }
}
