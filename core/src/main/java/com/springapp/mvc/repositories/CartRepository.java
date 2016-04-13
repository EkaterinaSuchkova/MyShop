package com.springapp.mvc.repositories;

import com.springapp.mvc.common.CartInfo;
import com.springapp.mvc.common.GoodInfo;

import java.util.List;

/**
 * Created by Катя on 26.03.2016.
 */
public interface CartRepository {
    /**
     * Добавление записи-корзины в БД
     */
    void addInCart(CartInfo cartInfo);
    /**
     * Удаление записи-корзины из БД по ее id
     */
    void deletetFromCart(Long cartId);
    /**
     * Удаление записи-корзины из БД по id товара
     */
    void deleteFromCartByGoodId(Long goodId);
    /**
     * Обновление записи-корзины
     */
    void update(CartInfo cartInfo);
    /**
     * Получение всех записей из таблицы корзин
     */
    public List<CartInfo> getAll();
    /**
     * Получаем записи-корзины из БД по указанному id товара
     */
    public List<CartInfo> getByGoodId(Long goodId);
    /**
     * Получаем записи-корзины из БД у юзера с указанным id
     */
    public List<CartInfo> getByUserId(Long userId);
    /**
     * Получаем информацию о товаре переходя из таблицы корзин в таблицу товаров по id товара
     */
    public List<GoodInfo> getGoodByGoodIdFromCart(Long goodId);

}
