package com.springapp.mvc.services;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ���� on 06.04.2016.
 */

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;
    /**
     * ����� ��������� ������� �������
     */
    @Transactional
    public List<CategoryInfo> getWomanCategories(){
        return categoryRepository.getChildCategory(1L);
    }
    /**
     * ����� ��������� ������� �������
     */
    @Transactional
    public List<CategoryInfo> getManCategories(){
        return categoryRepository.getChildCategory(2L);
    }


}
