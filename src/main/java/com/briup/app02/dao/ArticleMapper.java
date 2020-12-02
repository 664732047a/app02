package com.briup.app02.dao;

import com.briup.app02.bean.Article;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ArticleMapper {

    @Select("select * from cms_article")
    List<Article> selectAll();

    @Select("select * from cms_article where id=#{id}")
    Article selectById(Integer id);

    @Insert("insert into cms_article (title,publish_time,content,read_times,thumb_up,thumb_down) values(#{title},#{publishTime},#{content},#{readTimes},#{thumbUp},#{thumbDown})")
    void insert(Article article);

    @Delete("delete from cms_article where id=#{id}")
    void deleteById(Integer id);
}
