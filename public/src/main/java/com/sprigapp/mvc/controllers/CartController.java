package com.sprigapp.mvc.controllers;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.services.CartService;
import com.springapp.mvc.services.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Катя on 24.02.2016.
 */
@Controller
@RequestMapping("/cart")
public class CartController {


    @Autowired
    private HttpServletRequest request;
    @Autowired
    private GoodService goodService;
    @Autowired
    private CartService cartService;


    @RequestMapping(value = "/add/{id}",method = RequestMethod.GET)
    public String addInCart(@PathVariable("id") Long goodId, Model model){
        cartService.addInCart(goodId, request.getSession(), 1);
        //GoodInfo goodInfo = goodService.getGood(goodId);
        List<GoodInfo> goodInfo = goodService.selectAll();
        model.addAttribute("good", goodInfo);
        return "cart";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String renderCart(Model model){
        List<GoodInfo> goodInfo = goodService.selectAll();
        model.addAttribute("good", goodInfo);
        return "cart";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String deleteFromCart(@PathVariable("id") Long goodId){
        cartService.deleteFromCart(request.getSession(),goodId);
        return "redirect:/cart";
    }
    @ResponseBody
    @RequestMapping(value = "/changeCount",method = RequestMethod.POST)
    public String changeCount(Long goodId, Integer count){
        cartService.addInCart(goodId, request.getSession(), count);
        return "ok";
    }
}
