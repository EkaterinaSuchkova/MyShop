package com.springapp.mvc.repositories;

import com.springapp.mvc.common.AddressInfo;

/**
 * Created by Катя on 26.03.2016.
 */
public interface AddressRepository {
    void addAddress(AddressInfo addressInfo);
    void deleteAddress(Long addressId);
    void updateAddress(AddressInfo addressInfo);
    void deleteAddressByUserId(Long userId);
    AddressInfo getAddressById(Long addressId);
}
