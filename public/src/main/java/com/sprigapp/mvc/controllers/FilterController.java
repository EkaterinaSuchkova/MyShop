package com.sprigapp.mvc.controllers;

import com.sprigapp.mvc.aspects.annotation.IncludeCategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.services.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Катя on 08.04.2016.
 */
@Controller
@RequestMapping("/filter")
public class FilterController {

    @Autowired
    private GoodService goodService;

    /**
     * Фильтрация товара по выбранным параметрам
     */
    @IncludeCategoryInfo//аннотоация аспекта выносящего левое меню категорий
    @RequestMapping(method = RequestMethod.GET)
    public String filter(Model model,String color, String size, BigDecimal min, BigDecimal max){

        if(color!=null && size!=null){
            List<GoodInfo> goods = goodService.getGoodByColorAndSize(color,size);
            model.addAttribute("goods",goods);
        }
        if(color == null && size!=null){
            List<GoodInfo> goods = goodService.getGoodBySize(size);
            model.addAttribute("goods",goods);
        }
        if(size == null && color!=null){
            List<GoodInfo> goods = goodService.getGoodByColor(color);
            model.addAttribute("goods",goods);
        }
        if(size==null && color==null && min!=null && max!=null){
            List<GoodInfo> goods = goodService.getGoodByPrice(min,max);
            model.addAttribute("goods",goods);
        }
        if(size!=null && color!=null && min!=null && max!=null){
            List<GoodInfo> goods = goodService.getGoodByAllFilters(color,size,min,max);
            model.addAttribute("goods",goods);
        }
//        model.addAttribute("color", color);
//        model.addAttribute("size",size);
        return "catalog/catalog";
    }
}
