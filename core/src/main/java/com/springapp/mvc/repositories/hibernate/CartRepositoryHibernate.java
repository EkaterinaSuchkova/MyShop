package com.springapp.mvc.repositories.hibernate;

import com.springapp.mvc.common.CartInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.CartRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Катя on 26.03.2016.
 */
@Repository
public class CartRepositoryHibernate implements CartRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session curSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void addInCart(CartInfo cartInfo) {
        curSession().save(cartInfo);
    }

    @Override
    public void deletetFromCart(Long cartId) {
        curSession().delete(new CartInfo(cartId));
    }

    @Override
    public void deleteFromCartByGoodId(Long goodId) {
        curSession().createSQLQuery("DELETE FROM H_CART WHERE H_CART.GOOD_ID = :goodId")
                .addEntity(CartInfo.class).setLong("goodId", goodId);
    }

    @Override
    public void update(CartInfo cartInfo) {
        curSession().update(cartInfo);
    }

    @Override
    public List<CartInfo> getAll() {
        return  (List<CartInfo>) curSession().createQuery("from CartInfo").list();
    }

    @Override
    public List<CartInfo> getByGoodId(Long goodId) {
        return (List<CartInfo>) curSession().createSQLQuery("select * from H_CART WHERE GOOD_ID=:goodId").addEntity(CartInfo.class).setLong("goodId", goodId).list();
    }

    @Override
    public List<CartInfo> getByUserId(Long userId) {
        return (List<CartInfo>) curSession().createSQLQuery("select * from H_CART WHERE GOOD_ID=:userId").addEntity(CartInfo.class).setLong("userId", userId).list();
    }

    @Override
    public List<GoodInfo> getGoodByGoodIdFromCart(Long goodId) {
        return (List<GoodInfo>) curSession().createSQLQuery("select * from H_CART g JOIN H_GOODS c ON :goodId = c.ID ").addEntity(GoodInfo.class).setLong("goodId", goodId).list();
    }
}
