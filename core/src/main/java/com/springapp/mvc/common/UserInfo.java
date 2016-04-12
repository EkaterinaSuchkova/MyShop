package com.springapp.mvc.common;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Катя on 25.03.2016.
 */
@Entity
@Table(name = "h_user")
public class UserInfo {
    @Id                    // т.е. данное поле является id (уникальным)
    @Column(name = "id")   // обозначает имя колонки, соответствующей данному полю
    @GeneratedValue(strategy = GenerationType.AUTO)  // определяет способ генерации
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)  // указываем, что email должен быть уникальным
    private String email;

    private String login;

    private String hashPassword;

    private Boolean enabled;

    private String role;


    @OneToOne                          // определяет отношение один к одному
    @JoinColumn(name = "address_id")
    // связка с таблицей Address будет происходить по столбцу address_id в таблице Customer
    private AddressInfo address;

    @OneToMany(cascade = CascadeType.REFRESH,
            fetch = FetchType.LAZY,
            mappedBy = "userInfo")
    private List<OrderInfo> orders;

    @OneToMany(cascade = CascadeType.REFRESH,
            fetch = FetchType.LAZY,
            mappedBy = "userInfo")
    private List<CartInfo> cartInfos;

    public UserInfo() {
    }

    public UserInfo(Long userId) {
        this.id = userId;
    }

    public UserInfo(String name, String email, String login, String hashPassword, Boolean enabled, String role, AddressInfo address) {
        this.name = name;
        this.email = email;
        this.login = login;
        this.hashPassword = hashPassword;
        this.enabled = enabled;
        this.role = role;
        this.address = address;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public AddressInfo getAddress() {
        return address;
    }

    public void setAddress(AddressInfo address) {
        this.address = address;
    }

    public List<OrderInfo> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderInfo> orders) {
        this.orders = orders;
    }

    public List<CartInfo> getCartInfos() {
        return cartInfos;
    }

    public void setCartInfos(List<CartInfo> cartInfos) {
        this.cartInfos = cartInfos;
    }
}


