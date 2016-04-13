package com.springapp.mvc.common;

import javax.persistence.*;

/**
 * Created by ���� on 25.03.2016.
 */
@Entity
@Table(name = "h_address")
public class AddressInfo {

    @Id                    // �.�. ������ ���� �������� id (����������)
    @Column(name = "id")   // ���������� ��� �������, ��������������� ������� ����
    @GeneratedValue(strategy = GenerationType.AUTO)  // ���������� ������ ���������
    private Long id;
    /**
     * �����
     */
    @Column(length = 50, nullable = false)
    private String city;
    /**
     * �����
     */
    @Column(length = 50)
    private String street;
    /**
     * ���
     */
    @Column(length = 25)
    private String house;
    /**
     * ��������
     */
    @Column(length = 25)
    private String flat;

    public AddressInfo() {
    }

    public AddressInfo(Long id) {
        this.id = id;
    }

    public AddressInfo(String city, String street, String house, String flat) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}

