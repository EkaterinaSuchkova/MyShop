package com.springapp.mvc.repositories.hibernate;

import com.springapp.mvc.common.UserInfo;
import com.springapp.mvc.repositories.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Катя on 26.03.2016.
 */
@Repository
public class UserRepositoryHibernate implements UserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session curSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addUser(UserInfo userInfo) {
        curSession().save(userInfo);
    }

    @Override
    public void deleteUser(Long userId) {
        curSession().delete(new UserInfo(userId));
    }

    @Override
    public void updateUser(UserInfo userInfo) {
        curSession().update(userInfo);
    }

    @Override
    public UserInfo getUserByLogin(String login) {
        return (UserInfo) curSession().createSQLQuery("SELECT * FROM H_USER WHERE LOGIN = :login").addEntity(UserInfo.class).setString("login", login);
    }
}
