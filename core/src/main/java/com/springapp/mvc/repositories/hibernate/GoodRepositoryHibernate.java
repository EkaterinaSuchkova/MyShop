package com.springapp.mvc.repositories.hibernate;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.GoodRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Gataullin Kamil
 * 16.03.2016 22:01
 */
@Repository
public class GoodRepositoryHibernate implements GoodRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session curSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addGood(GoodInfo goodInfo) {
        curSession().save(goodInfo);
    }

    @Override
    public void updateGood(GoodInfo goodInfo) {
        curSession().update(goodInfo);
        // а если его еще нет, то лучше сохранить его
//        curSession().saveOrUpdate(goodInfo);
    }

    @Override
    public void deleteGood(Long goodId) {
        // удаление происходит только по сравнению id, поэтому весь объект нам и не нужен
        curSession().delete(new GoodInfo(goodId));
    }

    @Override
    public GoodInfo getGoodById(Long goodId) {
        // 1. It will always return a “proxy” (Hibernate term) without hitting the database.
        //    In Hibernate, proxy is an object with the given identifier value,
        //    its properties are not initialized yet, it just look like a temporary fake object.
        // 2. If no row found , it will throws an ObjectNotFoundException.
//        return (GoodInfo) curSession().load(GoodInfo.class, goodId);

        // 1. It always hit the database and return the real object,
        //    an object that represent the database row, not proxy.
        // 2. If no row found , it return null.
        //return (GoodInfo) curSession().createSQLQuery("SELECT * FROM H_GOODS WHERE ID = :goodId").addEntity(GoodInfo.class).setLong("goodId",goodId);
        return (GoodInfo) curSession().get(GoodInfo.class, goodId);
        // Запрос через Критерий. Можно и так. Но зачем?
//        return (GoodInfo) curSession().createCriteria(GoodInfo.class).add(Restrictions.idEq(goodId));
    }

    @Override
    public List<GoodInfo> getAllGoods() {
        return  (List<GoodInfo>) curSession().createQuery("from GoodInfo").list();
    }

    @Override
    public List<GoodInfo> getSaleGoods(String status) {
        return  (List<GoodInfo>) curSession().createQuery("from GoodInfo where status like :status ORDER BY price asc")
                .setString("status",status).list();
    }

    @Override
    public List<GoodInfo> getSaleGoodsNameAsc(String status) {
        return  (List<GoodInfo>) curSession().createQuery("from GoodInfo where status like :status ORDER BY name asc")
                .setString("status",status).list();
    }

    @Override
    public List<GoodInfo> getGoodByCategoryIdAsc(Long categoryId) {
        return (List<GoodInfo>) curSession().createSQLQuery("SELECT * FROM H_GOODS WHERE CATEGORY_ID = :catId ORDER BY PRICE ASC").addEntity(GoodInfo.class).setLong("catId",categoryId).list();
    }

    @Override
    public List<GoodInfo> getGoodByCategoryIdAscName(Long categoryId) {
        return (List<GoodInfo>) curSession().createSQLQuery("SELECT * FROM H_GOODS WHERE CATEGORY_ID = :catId ORDER BY NAME ASC").addEntity(GoodInfo.class).setLong("catId",categoryId).list();
    }


    @Override
    public List<GoodInfo> getGoodByColorAndSize(String color, String sizee) {
        return (List<GoodInfo>) curSession().createSQLQuery("SELECT * FROM H_GOODS WHERE COLOR LIKE :color and SIZEE LIKE :sizee").addEntity(GoodInfo.class).setString("color",color).setString("sizee",sizee).list();
    }

    @Override
    public List<GoodInfo> getGoodByColor(String color) {
        return (List<GoodInfo>) curSession().createSQLQuery("SELECT * FROM H_GOODS WHERE COLOR LIKE :color").addEntity(GoodInfo.class).setString("color",color).list();
    }

    @Override
    public List<GoodInfo> getGoodBySize(String sizee) {
        return (List<GoodInfo>) curSession().createSQLQuery("SELECT * FROM H_GOODS WHERE SIZEE LIKE :sizee").addEntity(GoodInfo.class).setString("sizee", sizee).list();
    }

    @Override
    public List<GoodInfo> getByPrice(BigDecimal minPrice,BigDecimal maxPrice) {
        return (List<GoodInfo>) curSession().createSQLQuery("SELECT * FROM H_GOODS WHERE PRICE BETWEEN :minPrice AND :maxPrice").addEntity(GoodInfo.class).setBigDecimal("minPrice",minPrice).setBigDecimal("maxPrice",maxPrice).list();
    }

    @Override
    public List<GoodInfo> getGoodByColorAndSizeAndPrice(String color, String size, BigDecimal minPrice, BigDecimal mixPrice) {
        return (List<GoodInfo>) curSession().createSQLQuery("SELECT * FROM H_GOODS WHERE COLOR LIKE :color and SIZEE LIKE :sizee AND PRICE BETWEEN :minPrice AND :maxPrice").addEntity(GoodInfo.class).setString("color",color).setString("sizee",size).setBigDecimal("minPrice",minPrice).setBigDecimal("maxPrice", mixPrice).list();
    }

}
