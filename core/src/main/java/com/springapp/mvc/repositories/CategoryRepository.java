package com.springapp.mvc.repositories;

import com.springapp.mvc.common.CategoryInfo;

import java.util.List;

/**
 * Gataullin Kamil
 * 08.03.2016 20:34
 */
public interface CategoryRepository {
    /**
     * Добавление категории в БД
     */
    void addCategory(CategoryInfo categoryInfo);
    /**
     * Удаление категории из Бд по ее id
     */
    void deleteCategory(Long categoryId);
    /**
     * Получение категории по ее id
     */
    CategoryInfo getCategoryById(Long categoryId);
    /**
     * Получение дочерних категорий для указанной категории
     */
    List<CategoryInfo> getChildCategory(Long parentId);
}
