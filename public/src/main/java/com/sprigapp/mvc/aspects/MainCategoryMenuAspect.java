package com.sprigapp.mvc.aspects;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.services.CategoryService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Катя on 08.04.2016.
 */

/**
 * Аспект для вынесения левого меню категорий
 */
@Aspect
@Component
public class MainCategoryMenuAspect {

    private static final String MAIN_CATEGORY_WOMAN_LIST = "categoryWomanMenu";

    private static final String MAIN_CATEGORY_MAN_LIST = "categoryManMenu";


    @Autowired
    private HttpServletRequest request;
    @Autowired
    private CategoryService categoryService;

   @Pointcut("@annotation(com.sprigapp.mvc.aspects.annotation.IncludeCategoryInfo)")
    public void includeMenuInfoMethod() {
    }

    @Before("includeMenuInfoMethod()")
    public void includeMenuInfo() {
        List<CategoryInfo> listMenu = categoryService.getWomanCategories();//получение женских товаров
        List<CategoryInfo> listMenu2 = categoryService.getManCategories();//получение мужских товаров
        request.setAttribute(MAIN_CATEGORY_WOMAN_LIST, listMenu);
        request.setAttribute(MAIN_CATEGORY_MAN_LIST, listMenu2);
    }
}
