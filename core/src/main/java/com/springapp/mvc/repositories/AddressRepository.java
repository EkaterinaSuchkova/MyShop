package com.springapp.mvc.repositories;

import com.springapp.mvc.common.AddressInfo;

/**
 * Created by ���� on 26.03.2016.
 */
public interface AddressRepository {
    /**
     * ���������� ������ � ��
     */
    void addAddress(AddressInfo addressInfo);
    /**
     * �������� ������ �� �� �� ��� id
     */
    void deleteAddress(Long addressId);
    /**
     * ���������� ������
     */
    void updateAddress(AddressInfo addressInfo);
    /**
     * �������� ������ � ������������ � ����� id
     */
    void deleteAddressByUserId(Long userId);
    /**
     * �������� ����� �� ���� id
     */
    AddressInfo getAddressById(Long addressId);
}
