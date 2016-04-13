package com.springapp.mvc.repositories;

import com.springapp.mvc.common.CategoryInfo;

import java.util.List;

/**
 * Gataullin Kamil
 * 08.03.2016 20:34
 */
public interface CategoryRepository {
    /**
     * ���������� ��������� � ��
     */
    void addCategory(CategoryInfo categoryInfo);
    /**
     * �������� ��������� �� �� �� �� id
     */
    void deleteCategory(Long categoryId);
    /**
     * ��������� ��������� �� �� id
     */
    CategoryInfo getCategoryById(Long categoryId);
    /**
     * ��������� �������� ��������� ��� ��������� ���������
     */
    List<CategoryInfo> getChildCategory(Long parentId);
}
