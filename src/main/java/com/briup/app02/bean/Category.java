package com.briup.app02.bean;

import java.io.Serializable;

public class Category implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_category.id
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_category.name
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_category.nu
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private Integer nu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_category.parent_id
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jz_category
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_category.id
     *
     * @return the value of jz_category.id
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_category.id
     *
     * @param id the value for jz_category.id
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_category.name
     *
     * @return the value of jz_category.name
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_category.name
     *
     * @param name the value for jz_category.name
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_category.nu
     *
     * @return the value of jz_category.nu
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public Integer getNu() {
        return nu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_category.nu
     *
     * @param nu the value for jz_category.nu
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public void setNu(Integer nu) {
        this.nu = nu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_category.parent_id
     *
     * @return the value of jz_category.parent_id
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_category.parent_id
     *
     * @param parentId the value for jz_category.parent_id
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}