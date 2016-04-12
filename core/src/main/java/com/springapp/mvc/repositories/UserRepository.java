package com.springapp.mvc.repositories;

import com.springapp.mvc.common.UserInfo;

/**
 * Created by Катя on 26.03.2016.
 */
public interface UserRepository {
    void addUser(UserInfo userInfo);
    void deleteUser(Long userId);
    void updateUser(UserInfo userInfo);
    public UserInfo getUserByLogin(String login);
}
