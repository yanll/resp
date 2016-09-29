package com.cmp.common.bean;

import java.util.Date;

public class GoodsBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_name
     *
     * @mbggenerated
     */
    private String goods_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_desc
     *
     * @mbggenerated
     */
    private String goods_desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.add_date
     *
     * @mbggenerated
     */
    private Date add_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.cost_price
     *
     * @mbggenerated
     */
    private Integer cost_price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.price
     *
     * @mbggenerated
     */
    private Integer price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.tag_id
     *
     * @mbggenerated
     */
    private Long tag_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.brand_id
     *
     * @mbggenerated
     */
    private Long brand_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.cover_img
     *
     * @mbggenerated
     */
    private String cover_img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.idx
     *
     * @mbggenerated
     */
    private Long idx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.type_id
     *
     * @mbggenerated
     */
    private Long type_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.id
     *
     * @return the value of t_goods.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.id
     *
     * @param id the value for t_goods.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_name
     *
     * @return the value of t_goods.goods_name
     *
     * @mbggenerated
     */
    public String getGoods_name() {
        return goods_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_name
     *
     * @param goods_name the value for t_goods.goods_name
     *
     * @mbggenerated
     */
    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name == null ? null : goods_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_desc
     *
     * @return the value of t_goods.goods_desc
     *
     * @mbggenerated
     */
    public String getGoods_desc() {
        return goods_desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_desc
     *
     * @param goods_desc the value for t_goods.goods_desc
     *
     * @mbggenerated
     */
    public void setGoods_desc(String goods_desc) {
        this.goods_desc = goods_desc == null ? null : goods_desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.add_date
     *
     * @return the value of t_goods.add_date
     *
     * @mbggenerated
     */
    public Date getAdd_date() {
        return add_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.add_date
     *
     * @param add_date the value for t_goods.add_date
     *
     * @mbggenerated
     */
    public void setAdd_date(Date add_date) {
        this.add_date = add_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.cost_price
     *
     * @return the value of t_goods.cost_price
     *
     * @mbggenerated
     */
    public Integer getCost_price() {
        return cost_price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.cost_price
     *
     * @param cost_price the value for t_goods.cost_price
     *
     * @mbggenerated
     */
    public void setCost_price(Integer cost_price) {
        this.cost_price = cost_price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.price
     *
     * @return the value of t_goods.price
     *
     * @mbggenerated
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.price
     *
     * @param price the value for t_goods.price
     *
     * @mbggenerated
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.tag_id
     *
     * @return the value of t_goods.tag_id
     *
     * @mbggenerated
     */
    public Long getTag_id() {
        return tag_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.tag_id
     *
     * @param tag_id the value for t_goods.tag_id
     *
     * @mbggenerated
     */
    public void setTag_id(Long tag_id) {
        this.tag_id = tag_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.brand_id
     *
     * @return the value of t_goods.brand_id
     *
     * @mbggenerated
     */
    public Long getBrand_id() {
        return brand_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.brand_id
     *
     * @param brand_id the value for t_goods.brand_id
     *
     * @mbggenerated
     */
    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.cover_img
     *
     * @return the value of t_goods.cover_img
     *
     * @mbggenerated
     */
    public String getCover_img() {
        return cover_img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.cover_img
     *
     * @param cover_img the value for t_goods.cover_img
     *
     * @mbggenerated
     */
    public void setCover_img(String cover_img) {
        this.cover_img = cover_img == null ? null : cover_img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.idx
     *
     * @return the value of t_goods.idx
     *
     * @mbggenerated
     */
    public Long getIdx() {
        return idx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.idx
     *
     * @param idx the value for t_goods.idx
     *
     * @mbggenerated
     */
    public void setIdx(Long idx) {
        this.idx = idx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.status
     *
     * @return the value of t_goods.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.status
     *
     * @param status the value for t_goods.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.type_id
     *
     * @return the value of t_goods.type_id
     *
     * @mbggenerated
     */
    public Long getType_id() {
        return type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.type_id
     *
     * @param type_id the value for t_goods.type_id
     *
     * @mbggenerated
     */
    public void setType_id(Long type_id) {
        this.type_id = type_id;
    }
}