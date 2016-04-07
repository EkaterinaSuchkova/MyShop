package com.springapp.mvc.repositories.hibernate;

import com.springapp.mvc.common.AddressInfo;
import com.springapp.mvc.repositories.AddressRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Катя on 26.03.2016.
 */
@Repository
public class AddressRepositoryHibernate implements AddressRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session curSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addAddress(AddressInfo addressInfo) {
     curSession().save(addressInfo);
    }

    @Override
    public void deleteAddress(Long addressId) {
        curSession().delete(new AddressInfo(addressId));
    }

    @Override
    public void updateAddress(AddressInfo addressInfo) {
        curSession().update(addressInfo);
    }

    @Override
    public void deleteAddressByUserId(Long userId) {

    }

    @Override
    public AddressInfo getAddressById(Long addressId) {
        return (AddressInfo) curSession().get(AddressInfo.class,addressId);
    }
}
