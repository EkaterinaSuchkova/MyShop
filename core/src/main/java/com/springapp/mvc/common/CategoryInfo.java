package com.springapp.mvc.common;

import javax.persistence.*;
import java.util.List;

/**
 * Информация о категории
 *
 * 27.02.2016 0:48
 */
@Entity
@Table(name = "h_categories")
public class CategoryInfo {

    /**
     * id категории
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Название категории
     */
    private String name;

    /**
     * Список дочерних категорий
     */
    @OneToMany(mappedBy = "parent")
    private List<CategoryInfo> children;

    /**
     * Родительская категория
     */
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private CategoryInfo parent;


    @OneToMany(mappedBy = "category")
    private List<GoodInfo> goodInfos;


    public CategoryInfo() {
    }

    public CategoryInfo(Long id, String name, List<CategoryInfo> children) {
        this.id = id;
        this.name = name;
        this.children = children;
    }

    public CategoryInfo(Long categoryId) {
        this.id = categoryId;
    }

    public CategoryInfo(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public List<CategoryInfo> getChildren() {
        return children;
    }

    public void setChildren(List<CategoryInfo> children) {
        this.children = children;
    }

    public CategoryInfo getParent() {
        return parent;
    }

    public void setParent(CategoryInfo parent) {
        this.parent = parent;
    }

    public List<GoodInfo> getGoodInfos() {
        return goodInfos;
    }

    public void setGoodInfos(List<GoodInfo> goodInfos) {
        this.goodInfos = goodInfos;
    }
}
