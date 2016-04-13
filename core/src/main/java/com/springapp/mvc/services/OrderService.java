package com.springapp.mvc.services;

import com.springapp.mvc.common.OrderInfo;
import com.springapp.mvc.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Катя on 13.04.2016.
 */
@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Transactional
    public void addOrder(OrderInfo orderInfo){
        orderRepository.addInOrder(orderInfo);
    }

}
