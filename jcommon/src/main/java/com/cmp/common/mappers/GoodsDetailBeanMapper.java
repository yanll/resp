package com.cmp.common.mappers;

import com.cmp.common.bean.GoodsDetailBean;

public interface GoodsDetailBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_detail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_detail
     *
     * @mbggenerated
     */
    int insert(GoodsDetailBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_detail
     *
     * @mbggenerated
     */
    int insertSelective(GoodsDetailBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_detail
     *
     * @mbggenerated
     */
    GoodsDetailBean selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GoodsDetailBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(GoodsDetailBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_detail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GoodsDetailBean record);
}