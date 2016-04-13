package com.springapp.mvc.repositories;

import com.springapp.mvc.common.GoodInfo;

import java.math.BigDecimal;
import java.util.List;

public interface GoodRepository {
    /**
     * ���������� ������ � ��
     */
    void addGood(GoodInfo goodInfo);
    /**
     * ���������� ������
     */
    void updateGood(GoodInfo goodInfo);
    /**
     * ������� ����� �� ��� id
     */
    void deleteGood(Long goodId);
    /**
     * �������� ����� �� ��� id
     */
    GoodInfo getGoodById(Long goodId);
    /**
     * �������� ��� ������
     */
    public List<GoodInfo> getAllGoods();
    /**
     * �������� ������ �� �������� "sale"
     */
    public List<GoodInfo> getSaleGoods(String status);
    /**
     * �������� ������ �� �������� "sale"  �� ����������� �����
     */
    public List<GoodInfo> getSaleGoodsNameAsc(String status);
    /**
     * �������� ������ �� �������� ��������� �� ����������� ����
     */
    public List<GoodInfo> getGoodByCategoryIdAsc(Long categoryId);
    /**
     * �������� ������ �� �������� ��������� �� ����������� �����
     */
    public List<GoodInfo> getGoodByCategoryIdAscName(Long categoryId);
    /**
     * �������� ������ �� ���������� ����� � �������
     */
    public List<GoodInfo> getGoodByColorAndSize(String color, String size);
    /**
     * �������� ������ �� ���������� �����
     */
    public List<GoodInfo> getGoodByColor(String color);
    /**
     * �������� ������ �� ���������� �������
     */
    public List<GoodInfo> getGoodBySize(String size);
    /**
     * �������� ������ �� ��������� ������� ���
     */
    public List<GoodInfo> getByPrice(BigDecimal minPrice, BigDecimal mixPrice);
    /**
     * �������� ������ �� ���������� ����� � ������� � ����
     */
    public List<GoodInfo> getGoodByColorAndSizeAndPrice(String color, String size,BigDecimal minPrice, BigDecimal mixPrice);

}
