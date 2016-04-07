package com.springapp.mvc.repositories;

import com.springapp.mvc.common.CategoryInfo;

import java.util.List;

/**
 * Gataullin Kamil
 * 08.03.2016 20:34
 */
public interface CategoryRepository {
    void addCategory(CategoryInfo categoryInfo);
    void deleteCategory(Long categoryId);
    CategoryInfo getCategoryById(Long categoryId);
    List<CategoryInfo> getChildCategory(Long parentId);
}
