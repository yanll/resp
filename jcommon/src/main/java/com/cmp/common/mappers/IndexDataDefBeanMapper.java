package com.cmp.common.mappers;

import com.cmp.common.bean.IndexDataDefBean;

public interface IndexDataDefBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_index_data_def
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_index_data_def
     *
     * @mbggenerated
     */
    int insert(IndexDataDefBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_index_data_def
     *
     * @mbggenerated
     */
    int insertSelective(IndexDataDefBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_index_data_def
     *
     * @mbggenerated
     */
    IndexDataDefBean selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_index_data_def
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(IndexDataDefBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_index_data_def
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(IndexDataDefBean record);
}