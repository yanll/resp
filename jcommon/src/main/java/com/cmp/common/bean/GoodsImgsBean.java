package com.cmp.common.bean;

public class GoodsImgsBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_imgs.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_imgs.goods_id
     *
     * @mbggenerated
     */
    private Long goods_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_imgs.img
     *
     * @mbggenerated
     */
    private String img;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_imgs.id
     *
     * @return the value of t_goods_imgs.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_imgs.id
     *
     * @param id the value for t_goods_imgs.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_imgs.goods_id
     *
     * @return the value of t_goods_imgs.goods_id
     *
     * @mbggenerated
     */
    public Long getGoods_id() {
        return goods_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_imgs.goods_id
     *
     * @param goods_id the value for t_goods_imgs.goods_id
     *
     * @mbggenerated
     */
    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_imgs.img
     *
     * @return the value of t_goods_imgs.img
     *
     * @mbggenerated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods_imgs.img
     *
     * @param img the value for t_goods_imgs.img
     *
     * @mbggenerated
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}