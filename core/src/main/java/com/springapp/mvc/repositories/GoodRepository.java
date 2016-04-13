package com.springapp.mvc.repositories;

import com.springapp.mvc.common.GoodInfo;

import java.math.BigDecimal;
import java.util.List;

public interface GoodRepository {
    /**
     * добавление товара в БД
     */
    void addGood(GoodInfo goodInfo);
    /**
     * обновление товара
     */
    void updateGood(GoodInfo goodInfo);
    /**
     * Удалить товар по его id
     */
    void deleteGood(Long goodId);
    /**
     * Получить товар по его id
     */
    GoodInfo getGoodById(Long goodId);
    /**
     * Получить все товары
     */
    public List<GoodInfo> getAllGoods();
    /**
     * Получить товары со статусом "sale"
     */
    public List<GoodInfo> getSaleGoods(String status);
    /**
     * Получить товары со статусом "sale"  по возрастанию Имени
     */
    public List<GoodInfo> getSaleGoodsNameAsc(String status);
    /**
     * Получить товары по указаной категории по возрастанию цены
     */
    public List<GoodInfo> getGoodByCategoryIdAsc(Long categoryId);
    /**
     * Получить товары по указаной категории по возрастанию имени
     */
    public List<GoodInfo> getGoodByCategoryIdAscName(Long categoryId);
    /**
     * Получить товары по указанному цвету и размеру
     */
    public List<GoodInfo> getGoodByColorAndSize(String color, String size);
    /**
     * Получить товары по указанному цвету
     */
    public List<GoodInfo> getGoodByColor(String color);
    /**
     * Получить товары по указанному размеру
     */
    public List<GoodInfo> getGoodBySize(String size);
    /**
     * Получить товары по указанной границе цен
     */
    public List<GoodInfo> getByPrice(BigDecimal minPrice, BigDecimal mixPrice);
    /**
     * Получить товары по указанному цвету и размеру и цене
     */
    public List<GoodInfo> getGoodByColorAndSizeAndPrice(String color, String size,BigDecimal minPrice, BigDecimal mixPrice);

}
