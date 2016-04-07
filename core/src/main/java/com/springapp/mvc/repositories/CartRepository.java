package com.springapp.mvc.repositories;

import com.springapp.mvc.common.CartInfo;
import com.springapp.mvc.common.GoodInfo;

import java.util.List;

/**
 * Created by Катя on 26.03.2016.
 */
public interface CartRepository {
    void addInCart(CartInfo cartInfo);
    void deletetFromCart(Long cartId);
    void deleteFromCartByGoodId(Long goodId);
    void update(CartInfo cartInfo);
    public List<CartInfo> getAll();
    public List<CartInfo> getByGoodId(Long goodId);
    public List<CartInfo> getByUserId(Long userId);
    public List<GoodInfo> getGoodByGoodIdFromCart(Long goodId);

}
