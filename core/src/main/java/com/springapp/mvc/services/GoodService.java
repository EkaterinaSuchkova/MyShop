package com.springapp.mvc.services;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.CategoryRepository;
import com.springapp.mvc.repositories.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;


@Service
public class GoodService {


    @Autowired
    private GoodRepository goodRepository;

    @Autowired
    CategoryRepository categoryRepository;
    /**
     * Получить товар по указанному id
     */
    @Transactional
    public GoodInfo getGood(Long goodId) {
        return goodRepository.getGoodById(goodId);
    }
    /**
     * Добавить товар
     */
    @Transactional
    public void add(GoodInfo goodInfo) {
        goodRepository.addGood(goodInfo);
    }
    /**
     * Обновить товар
     */
    @Transactional
    public void update(GoodInfo goodInfo) {
        goodRepository.updateGood(goodInfo);
    }
    /**
     * Удалить товар по указанному id
     */
    @Transactional
    public void delete(Long goodId) {
        goodRepository.deleteGood(goodId);
    }
    /**
     * Получить все товары
     */
    @Transactional
    public List<GoodInfo> selectAll(){
        return goodRepository.getAllGoods();

    }
    /**
     * Получить товары со статусом "Sale" по возрастанию цены
     */
    @Transactional
    public List<GoodInfo> getSaleGood(){
        return goodRepository.getSaleGoods("sale");
    }
    /**
     * Получить товары со статусом "Sale" по возрастанию имени
     */
    @Transactional
    public List<GoodInfo> getSaleGoodNameAsc(){
        return goodRepository.getSaleGoodsNameAsc("sale");
    }
    /**
     * Получить товары указанной категории по возрастанию цены
     */
    @Transactional
    public List<GoodInfo> getGoodByCategoryAsc(Long categoryId){
        List<GoodInfo> goodInfos = goodRepository.getGoodByCategoryIdAsc(categoryId);
        List<CategoryInfo> categoryInfos = categoryRepository.getChildCategory(categoryId);
        if(categoryInfos != null) {//если список дочерних категорий не пуст
            for (CategoryInfo categoryInfo : categoryInfos) {
                goodInfos.addAll(goodRepository.getGoodByCategoryIdAsc(categoryInfo.getId()));//то соединяем 2 листа для вывода товаров входящих в дочерние категории
            }
        }
        return goodInfos;
    }
    /**
     * Получить товары указанной категории по возрастанию имени
     */
    @Transactional
    public List<GoodInfo> getGoodByCategoryAscName(Long categoryId){
        List<GoodInfo> goodInfos = goodRepository.getGoodByCategoryIdAscName(categoryId);
        List<CategoryInfo> categoryInfos = categoryRepository.getChildCategory(categoryId);
        if(categoryInfos != null) {//если список дочерних категорий не пуст
            for (CategoryInfo categoryInfo : categoryInfos) {
                goodInfos.addAll(goodRepository.getGoodByCategoryIdAscName(categoryInfo.getId()));//то соединяем 2 листа для вывода товаров входящих в дочерние категории
            }
        }
        return goodInfos;
    }
    /**
     * Получить товары указанного цвета и размера
     */
    @Transactional
    public List<GoodInfo> getGoodByColorAndSize(String color, String size){
        return goodRepository.getGoodByColorAndSize(color,size);
    }
    /**
     * Получить товары указанного цвета
     */
    @Transactional
    public List<GoodInfo> getGoodByColor(String color){
        return goodRepository.getGoodByColor(color);
    }
    /**
     * Получить товары указанного размера
     */
    @Transactional
    public List<GoodInfo> getGoodBySize(String size){
        return goodRepository.getGoodBySize(size);
    }
    /**
     * Получить товары указанного интервала цен
     */
    @Transactional
    public List<GoodInfo> getGoodByPrice(BigDecimal min, BigDecimal max){
        return goodRepository.getByPrice(min,max);
    }
    /**
     * Получить товары указанного цвета и размера и цены
     */
    @Transactional
    public List<GoodInfo> getGoodByAllFilters(String color, String size, BigDecimal minPrice, BigDecimal mixPrice){
        return goodRepository.getGoodByColorAndSizeAndPrice(color, size, minPrice, mixPrice);
    }

}
