package com.sprigapp.mvc.controllers;

import com.sprigapp.mvc.aspects.annotation.IncludeCategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.services.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.List;

/**
 * Контроллер отвечающий за каталог
 *
 * Gataullin Kamil
 * 22.02.2016 22:46
 */
@Controller
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private GoodService goodService;

    /**
     * Отображение каталога
     *
     * @param id    id категории
     * @return отображение каталога
     */
    @IncludeCategoryInfo
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String renderCatalog(@PathVariable("id") Long id,
                                Model model,
                                @RequestParam(value = "sort",required = false, defaultValue = "ascPrice") String sort) {
        if(sort.equals("descPrice")){
            List<GoodInfo> goods = goodService.getGoodByCategoryAsc(id);
            Collections.reverse(goods);
            model.addAttribute("goods",goods);
        }
        if(sort.equals("ascPrice")){
            List<GoodInfo> goods = goodService.getGoodByCategoryAsc(id);
            model.addAttribute("goods",goods);
        }
        if(sort.equals("ascName")){
            List<GoodInfo> goods = goodService.getGoodByCategoryAscName(id);
            model.addAttribute("goods",goods);
        }
        if(sort.equals("descName")){
            List<GoodInfo> goods = goodService.getGoodByCategoryAscName(id);
            Collections.reverse(goods);
            model.addAttribute("goods",goods);
        }
        return "catalog";
    }


    /**
     * Отображение главной страницы каталога
     */
    @IncludeCategoryInfo
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String mainCatalog(HttpServletRequest request,
                              @RequestParam(value = "sort",required = false, defaultValue = "ascPrice") String sort) {
        request.setAttribute("message", "Главная страница каталога");
        if(sort.equals("descPrice")){
            List<GoodInfo> goods = goodService.getSaleGood();
            Collections.reverse(goods);
            request.setAttribute("goods", goods);
        }
        if(sort.equals("ascPrice")){
            List<GoodInfo> goods = goodService.getSaleGood();
            request.setAttribute("goods", goods);
        }
        if(sort.equals("ascName")){
            List<GoodInfo> goods = goodService.getSaleGoodNameAsc();
            request.setAttribute("goods", goods);
        }
        if(sort.equals("descName")){
            List<GoodInfo> goods = goodService.getSaleGoodNameAsc();
            Collections.reverse(goods);
            request.setAttribute("goods",goods);
        }

        return "catalog";
    }
}
