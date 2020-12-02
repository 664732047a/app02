package com.briup.app02.dao;

import com.briup.app02.bean.Comment;
import com.briup.app02.bean.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    long countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    Comment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_comment
     *
     * @mbg.generated Wed Dec 02 19:32:46 CST 2020
     */
    int updateByPrimaryKey(Comment record);
}