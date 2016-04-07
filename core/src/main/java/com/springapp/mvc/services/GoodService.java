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

/**
 * Gataullin Kamil
 * 07.03.2016 0:20
 */
@Service
public class GoodService {


    @Autowired
    private GoodRepository goodRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Transactional
    public GoodInfo getGood(Long goodId) {
        return goodRepository.getGoodById(goodId);
    }

    @Transactional  // оборачивает данный метод в Транзакцию
    public void add(GoodInfo goodInfo) {
        goodRepository.addGood(goodInfo);
    }

    @Transactional  // оборачивает данный метод в Транзакцию
    public void update(GoodInfo goodInfo) {
        goodRepository.updateGood(goodInfo);
    }

    @Transactional  // оборачивает данный метод в Транзакцию
    public void delete(Long goodId) {
        goodRepository.deleteGood(goodId);
    }

    @Transactional
    public List<GoodInfo> selectAll(){
        return goodRepository.getAllGoods();

    }

    @Transactional
    public List<GoodInfo> getSaleGood(){
        return goodRepository.getSaleGoods("sale");
    }

    @Transactional
    public List<GoodInfo> getGoodByCategory(Long categoryId){
        List<GoodInfo> goodInfos = goodRepository.getGoodByCategoryId(categoryId);
        List<CategoryInfo> categoryInfos = categoryRepository.getChildCategory(categoryId);
        if(categoryInfos != null) {
            for (CategoryInfo categoryInfo : categoryInfos) {
                goodInfos.addAll(goodRepository.getGoodByCategoryId(categoryInfo.getId()));
            }
        }
        return goodInfos;
    }
}
