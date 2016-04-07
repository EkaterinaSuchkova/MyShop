package com.springapp.mvc.repositories.hibernate;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.common.OrderInfo;
import com.springapp.mvc.repositories.OrderRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Катя on 26.03.2016.
 */
@Repository
public class OrderRepositoryHibernate implements OrderRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session curSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addInOrder(GoodInfo goodInfo) {
        curSession().save(goodInfo);
    }

    @Override
    public void deleteFromOrder(Long goodId) {

    }
}
