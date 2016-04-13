package com.sprigapp.mvc.form;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by Катя on 07.04.2016.
 */
/**
 * Класс описывающий форму оформления заказа
 */
public class OrderFormBean {

    @NotEmpty(message = "Поле обязательно для заполнения")
    private String surName;

    @NotEmpty(message = "Поле обязательно для заполнения")
    private String name;

    @NotEmpty(message = "Поле обязательно для заполнения")
    private String MiddleName;

    @NotEmpty(message = "Поле обязательно для заполнения")
    @Pattern(regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}",
            message="Неверный формат email")
    private String email;

    @NotEmpty(message = "Поле обязательно для заполнения")
    private String city;

    @NotEmpty(message = "Поле обязательно для заполнения")
    private String flat;

    @NotEmpty(message = "Поле обязательно для заполнения")
    private String street;

    @NotEmpty(message = "Поле обязательно для заполнения")
    private String House;


    public OrderFormBean() {
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String house) {
        House = house;
    }
}
