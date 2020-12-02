package com.briup.app02.dao;

import com.briup.app02.bean.Role;
import com.briup.app02.bean.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    long countByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int deleteByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    List<Role> selectByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    Role selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_role
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int updateByPrimaryKey(Role record);
}