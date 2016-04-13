package com.sprigapp.mvc.controllers;

import com.sprigapp.mvc.form.OrderFormBean;
import com.springapp.mvc.common.CartSessionInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.common.OrderInfo;
import com.springapp.mvc.common.UserInfo;
import com.springapp.mvc.services.CartService;
import com.springapp.mvc.services.GoodService;
import com.springapp.mvc.services.OrderService;
import com.springapp.mvc.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Катя on 07.04.2016.
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private CartService cartService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private GoodService goodService;

    public static final String ATTR_ORDER_FORM = "orderForm";
    /**
     * Отображение формы оформления заказа
     */
    @RequestMapping(method = RequestMethod.GET)
    public String renderOrderForm(){
        request.setAttribute(ATTR_ORDER_FORM, new OrderFormBean());
        return "order/oreder";
    }
    /**
     * Обработка формы оформления заказа
     */
    @RequestMapping(method = RequestMethod.POST)
    public String orderForm(
            @Valid @ModelAttribute(ATTR_ORDER_FORM) OrderFormBean orderFormBean,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "order/oreder";
        }
        CartSessionInfo map = (CartSessionInfo) request.getSession().getAttribute(Constants.SESSION_CART);
        Map<Long,Integer> goods=map.getGoods();
        List<Long> goodId = new ArrayList<Long>(goods.keySet());
        List<GoodInfo> goodInfo = new ArrayList<GoodInfo>();
        for (Long aLong : goodId) {
            goodInfo.add(goodService.getGood(aLong));
        }
        orderService.addOrder(new OrderInfo(orderFormBean.getSurName(),new java.util.Date(),new UserInfo(33L), goodInfo));
        cartService.deleteAllFromCart(request.getSession());
        System.out.println(orderFormBean);
        return "order/successOrder";
    }

}
