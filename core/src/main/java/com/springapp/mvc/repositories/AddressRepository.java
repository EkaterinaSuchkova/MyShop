package com.springapp.mvc.repositories;

import com.springapp.mvc.common.AddressInfo;

/**
 * Created by Катя on 26.03.2016.
 */
public interface AddressRepository {
    /**
     * Добавление адреса в БД
     */
    void addAddress(AddressInfo addressInfo);
    /**
     * Удаление адреса из БД по его id
     */
    void deleteAddress(Long addressId);
    /**
     * Обновление адреса
     */
    void updateAddress(AddressInfo addressInfo);
    /**
     * Удаление адреса у пользователя с таким id
     */
    void deleteAddressByUserId(Long userId);
    /**
     * Получаем адрес по полю id
     */
    AddressInfo getAddressById(Long addressId);
}
