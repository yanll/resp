package com.yanll.business.auth.domain;

import com.yanll.framework.data.mysql.domain.DataEntity;
import com.yanll.framework.data.mysql.domain.VOEntity;

/*
* 当前文件为MybatisGenerator自动生成的VO，请手动剪切到*-service项目。
*/
public class UserRoleRelBeanVO extends VOEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user_role_rel.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user_role_rel.role_id
     *
     * @mbg.generated
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_user_role_rel.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user_role_rel.id
     *
     * @return the value of m_user_role_rel.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user_role_rel.id
     *
     * @param id the value for m_user_role_rel.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user_role_rel.role_id
     *
     * @return the value of m_user_role_rel.role_id
     *
     * @mbg.generated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user_role_rel.role_id
     *
     * @param roleId the value for m_user_role_rel.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_user_role_rel.user_id
     *
     * @return the value of m_user_role_rel.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_user_role_rel.user_id
     *
     * @param userId the value for m_user_role_rel.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}