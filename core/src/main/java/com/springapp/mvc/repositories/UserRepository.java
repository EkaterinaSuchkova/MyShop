package com.springapp.mvc.repositories;

import com.springapp.mvc.common.UserInfo;

/**
 * Created by ���� on 26.03.2016.
 */
public interface UserRepository {
    /**
     * ���������� ����� � ��
     */
    void addUser(UserInfo userInfo);
    /**
     * �������� ����� �� �� �� ��� id
     */
    void deleteUser(Long userId);
    /**
     * �������� �����
     */
    void updateUser(UserInfo userInfo);
    /**
     * �������� ����� �� ���������� login
     */
    public UserInfo getUserByLogin(String login);
}
