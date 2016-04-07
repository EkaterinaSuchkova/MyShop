package com.springapp.mvc.repositories.hibernate;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.CategoryRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Gataullin Kamil
 * 16.03.2016 22:21
 */
@Repository
public class CategoryRepositoryHibernate implements CategoryRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session curSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addCategory(CategoryInfo categoryInfo) {
        curSession().save(categoryInfo);
    }

    @Override
    public void deleteCategory(Long categoryId) {
        curSession().delete(new CategoryInfo(categoryId));
    }

    @Override
    public CategoryInfo getCategoryById(Long categoryId) {
        return (CategoryInfo) curSession().get(CategoryInfo.class, categoryId);
    }

    @Override
    public List<CategoryInfo> getChildCategory(Long parentId) {
        return curSession().createSQLQuery("SELECT * FROM H_CATEGORIES WHERE PARENT_ID = :parentId").addEntity(CategoryInfo.class).setLong("parentId",parentId).list();
    }
}
