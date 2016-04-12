package com.springapp.mvc.services;

import com.springapp.mvc.common.CartInfo;
import com.springapp.mvc.common.CartSessionInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.common.UserInfo;
import com.springapp.mvc.repositories.CartRepository;
import com.springapp.mvc.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Катя on 28.03.2016.
 */

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;


    @Transactional
    public void addInCart(Long goodId, HttpSession session, Integer count){//, Long userId) {
        CartSessionInfo cart = (CartSessionInfo) session.getAttribute(Constants.SESSION_CART);
        if (cart == null) {
            cart = new CartSessionInfo();
        }
        // обновляем в сессии
        if (cart.getGoods() == null) {
            Map<Long, Integer> map = new HashMap<Long, Integer>();
            map.put(goodId, count);
            cart.setGoods(map);
        } else {
            if (cart.getGoods().containsKey(goodId)) {
                cart.getGoods().put(goodId, count);
            } else {
                cart.getGoods().put(goodId, count);
            }
        }
        session.setAttribute(Constants.SESSION_CART, cart);

        // обновляем в БД
//        List<CartInfo> cartDB = cartRepository.getByGoodId(goodId);
//        if (cartDB == null || cartDB.isEmpty()) {
//            cartRepository.addInCart(new CartInfo(new GoodInfo(goodId), count, new UserInfo(userId)));
//        } else {
//            cartDB.get(0).setCount(count);
//            cartRepository.update(cartDB.get(0));
//        }
    }
    @Transactional
    public List<GoodInfo> getGoodByGoodIdFromCart(Long goodId){
        return cartRepository.getGoodByGoodIdFromCart(goodId);
    }

    @Transactional
    public void deleteFromCart(HttpSession session,Long goodId) {
        CartSessionInfo cart = (CartSessionInfo) session.getAttribute(Constants.SESSION_CART);

        //обновляем в сессии
        if (cart.getGoods().containsKey(goodId)) {
            cart.getGoods().remove(goodId);
        }
        session.setAttribute(Constants.SESSION_CART, cart);

        //обновляем в бд
//        cartRepository.deleteFromCartByGoodId(goodId);
    }
    @Transactional
    public void deleteAllFromCart(HttpSession session) {
        CartSessionInfo cart = (CartSessionInfo) session.getAttribute(Constants.SESSION_CART);

        //обновляем в сессии
        cart.getGoods().clear();
        session.setAttribute(Constants.SESSION_CART, cart);

        //обновляем в бд
//        cartRepository.deleteFromCartByGoodId(goodId);
    }



}

