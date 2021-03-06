package com.springapp.mvc.common;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ���� on 25.03.2016.
 */
@Entity
@Table(name = "h_user")
public class UserInfo {
    @Id                    // �.�. ������ ���� �������� id (����������)
    @Column(name = "id")   // ���������� ��� �������, ��������������� ������� ����
    @GeneratedValue(strategy = GenerationType.AUTO)  // ���������� ������ ���������
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)  // ���������, ��� email ������ ���� ����������
    private String email;

    @OneToOne                          // ���������� ��������� ���� � ������
    @JoinColumn(name = "address_id")   // ������ � �������� Address ����� ����������� �� ������� address_id � ������� Customer
    private AddressInfo address;

    @OneToMany(cascade = CascadeType.REFRESH,
            fetch = FetchType.LAZY,
            mappedBy="userInfo")
    private List<OrderInfo> orders;

    @OneToMany(cascade = CascadeType.REFRESH,
            fetch = FetchType.LAZY,
            mappedBy="userInfo")
    private List<CartInfo> cartInfos;

    public UserInfo() {
    }

    public UserInfo(Long userId) {
        this.id = userId;
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
}
