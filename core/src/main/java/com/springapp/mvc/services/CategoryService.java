package com.springapp.mvc.services;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Катя on 06.04.2016.
 */

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;



}
