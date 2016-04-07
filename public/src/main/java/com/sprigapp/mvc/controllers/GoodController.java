package com.sprigapp.mvc.controllers;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.services.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Катя on 07.04.2016.
 */
@Controller
@RequestMapping("/good")
public class GoodController {

    @Autowired
    private GoodService goodService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String showInfo(@PathVariable("id") Long goodId, Model model){
        GoodInfo goodInfo = goodService.getGood(goodId);
        model.addAttribute("goodInfo", goodInfo);
        return "goodInfo";
    }

}
