package com.sprigapp.mvc.controllers;

import com.sprigapp.mvc.form.OrderFormBean;
import com.springapp.mvc.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

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

    public static final String ATTR_ORDER_FORM = "orderForm";

    @RequestMapping(method = RequestMethod.GET)
    public String renderOrderForm(){
        request.setAttribute(ATTR_ORDER_FORM, new OrderFormBean());
        return "oreder";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String orderForm(
            @Valid @ModelAttribute(ATTR_ORDER_FORM) OrderFormBean orderFormBean,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "oreder";
        }
        // здесь должно происходить занесение заказа текущего пользователя в базу
        cartService.deleteAllFromCart(request.getSession());
        System.out.println(orderFormBean);
        return "successOrder";
    }

}
