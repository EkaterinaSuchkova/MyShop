package com.springapp.mvc.common;

import javax.persistence.*;

/**
 * Created by Катя on 25.03.2016.
 */
@Entity
@Table(name = "h_cart")
public class CartInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Поле id товара, связь с таблицей товаров
     */
    @ManyToOne
    @JoinColumn(name = "good_id")
    private GoodInfo goodInfo;
    /**
     * Поле id юзера, связь с таблицей юзеров
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserInfo userInfo;
    /**
     * Количество товара в корзине
     */
    @Column
    private Integer count;

    public CartInfo(GoodInfo goodInfo, Integer count, UserInfo userInfo) {
        this.goodInfo = goodInfo;
        this.count = count;
        this.userInfo = userInfo;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CartInfo() {
    }

    public CartInfo(GoodInfo goodInfo, Integer count){
        this.goodInfo = goodInfo;
        this.count = count;
    }

    public CartInfo(GoodInfo goodInfo){
        this.goodInfo = goodInfo;
    }

    public CartInfo(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GoodInfo getGoodInfo() {
        return goodInfo;
    }

    public void setGoodInfo(GoodInfo goodInfo) {
        this.goodInfo = goodInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }


}
