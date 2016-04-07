package com.springapp.mvc.common;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Основная информация о товаре
 *
 * Gataullin Kamil
 * 22.02.2016 22:54
 */
@Entity
@Table(name = "h_goods")
public class GoodInfo {

    /**
     * id товара
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Название товара
     */
    private String name;

    /**
     * Описание товара
     */
    private String description;

    /**
     * URL изображения
     */
    private String imageUrl;


    private String status;

    /**
     * Категория товара
     */
    private String gender;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryInfo category;

    /**
     * Цена
     */
    private BigDecimal price;

    public GoodInfo() {
    }

    public GoodInfo(Long id) {
        this.id = id;
    }

    public GoodInfo(Long id, String name, CategoryInfo category, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public GoodInfo(Long id, String name, String imageUrl, CategoryInfo category, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.category = category;
        this.price = price;
    }

    public GoodInfo(Long id, String name, String description, String imageUrl, CategoryInfo category, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.category = category;
        this.price = price;
    }

    public GoodInfo(Long l, String name, String description, String url, String gender, CategoryInfo i, BigDecimal i1) {
        this.id = l;
        this.name = name;
        this.description = description;
        this.imageUrl = url;
        this.gender = gender;
        this.category = i;
        this.price = i1;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getDecoratedName() {
        return "*** " + name + " ***";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CategoryInfo getCategory() {
        return category;
    }

    public void setCategory(CategoryInfo category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
