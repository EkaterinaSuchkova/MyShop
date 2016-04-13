package com.sprigapp.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Катя on 09.04.2016.
 */
@Controller
@RequestMapping("/cabinet")
public class CabinetController {
    /**
     * Рендеринг страницы личного кабинета пользователя
     */
    @RequestMapping(method = RequestMethod.GET)
    public String renderCabinetPage() {
        return "cabinet/cabinetPage";
    }
}
