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

    @Id                    // т.е. данное поле является id (уникальным)
    @GeneratedValue(strategy = GenerationType.AUTO)  // определяет способ генерации
    private Long id;

    // @Column(name = "name") название колонки можно не указывать, тогда будет использовано название поля.
    private String name;

    @Column(name = "creation_date")
    private Date creationDate;

    @ManyToOne                                  // определяет отношение многие к одному
            (cascade = {CascadeType.REFRESH},
                    fetch = FetchType.LAZY)    // подгрузка объектов списка сразу
    @JoinColumn(name = "customer_id")
    private UserInfo userInfo;

    @ManyToMany                                 // определяет отношение многие ко многим
            (cascade = CascadeType.REFRESH,
                    fetch = FetchType.LAZY)     // подгрузка объектов только при обращении к ним
    @JoinTable(name = "h_ORDERS_GOODS",           // вспомогательная связывающая таблица для отношений многие ко многим
            joinColumns = @JoinColumn(name = "ORDER_ID"),        // название колонки для связи с текущей таблицей Orders
            inverseJoinColumns = @JoinColumn(name = "GOOD_ID"))  // название колонки для связываемой таблицы Goods
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
