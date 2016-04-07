package com.springapp.mvc;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.hibernate.CategoryRepositoryHibernate;
import com.springapp.mvc.repositories.hibernate.GoodRepositoryHibernate;
import com.springapp.mvc.services.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * Created by Катя on 27.03.2016.
 */
public class Main {

    public static void main(String[] args) {
//        CategoryInfo categoryInfo = new CategoryInfo(1L,"Футболки");
        GoodService goodService = null;
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        goodService = context.getBean(GoodService.class);
//        goodService.add(new GoodInfo(1L,"Shirt","Cotton","/images/home/product1.jpg","woman",new CategoryInfo(1L),new BigDecimal(300)));
//        goodService.selectAll();
    }
}
