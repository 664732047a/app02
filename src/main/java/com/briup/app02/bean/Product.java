package com.briup.app02.bean;

import java.io.Serializable;

public class Product implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_product.id
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_product.name
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_product.introduce
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private String introduce;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_product.price
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private String price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_product.status
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_product.photo
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private String photo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_product.sales
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private Integer sales;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_product.category_id
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private Long categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jz_product
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_product.id
     *
     * @return the value of jz_product.id
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_product.id
     *
     * @param id the value for jz_product.id
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_product.name
     *
     * @return the value of jz_product.name
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_product.name
     *
     * @param name the value for jz_product.name
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_product.introduce
     *
     * @return the value of jz_product.introduce
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_product.introduce
     *
     * @param introduce the value for jz_product.introduce
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_product.price
     *
     * @return the value of jz_product.price
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public String getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_product.price
     *
     * @param price the value for jz_product.price
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_product.status
     *
     * @return the value of jz_product.status
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_product.status
     *
     * @param status the value for jz_product.status
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_product.photo
     *
     * @return the value of jz_product.photo
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_product.photo
     *
     * @param photo the value for jz_product.photo
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_product.sales
     *
     * @return the value of jz_product.sales
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_product.sales
     *
     * @param sales the value for jz_product.sales
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_product.category_id
     *
     * @return the value of jz_product.category_id
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_product.category_id
     *
     * @param categoryId the value for jz_product.category_id
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}