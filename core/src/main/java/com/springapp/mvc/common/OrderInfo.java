package com.springapp.mvc.common;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Катя on 25.03.2016.
 */
@Entity
@Table(name = "h_order")
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Название заказа
     */
    private String name;
    /**
     * Дата заказа
     */
    @Column(name = "creation_date")
    private Date creationDate;
    /**
     * Поле id заказчика, связь с таблицей юзеров
     */
    @ManyToOne
            (cascade = {CascadeType.REFRESH},
                    fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private UserInfo userInfo;
    /**
     * Вспомогательная таблица, для устранения связи многие ко многим
     */
    @ManyToMany
            (cascade = CascadeType.REFRESH,
                    fetch = FetchType.LAZY)
    @JoinTable(name = "h_ORDERS_GOODS",
            joinColumns = @JoinColumn(name = "ORDER_ID"),
            inverseJoinColumns = @JoinColumn(name = "GOOD_ID"))
    private List<GoodInfo> goods;

    public OrderInfo(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<GoodInfo> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodInfo> goods) {
        this.goods = goods;
    }
}
