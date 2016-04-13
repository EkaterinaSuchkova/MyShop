package com.springapp.mvc.repositories;

import com.springapp.mvc.common.UserInfo;

/**
 * Created by Катя on 26.03.2016.
 */
public interface UserRepository {
    /**
     * Добавление юзера в БД
     */
    void addUser(UserInfo userInfo);
    /**
     * Удаление юзера из БД по его id
     */
    void deleteUser(Long userId);
    /**
     * Обновить юзера
     */
    void updateUser(UserInfo userInfo);
    /**
     * Получить юзера по указанному login
     */
    public UserInfo getUserByLogin(String login);
}
