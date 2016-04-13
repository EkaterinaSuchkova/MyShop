package com.springapp.mvc.services;

import com.springapp.mvc.common.UserInfo;
import com.springapp.mvc.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Катя on 09.04.2016.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    /**
     * Получить юзера по указанному login
     */
    @Transactional
    public UserInfo getUserByLogin(String login) {
        return userRepository.getUserByLogin(login);
    }
    /**
     * Добавить юзера
     */
    @Transactional
    public void add(UserInfo userInfo){
        userRepository.addUser(userInfo);
    }


}
