package cn.edu.whu.irlab.dao;

import cn.edu.whu.irlab.model.Topic;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Topic record);

    int insertSelective(Topic record);

    Topic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKey(Topic record);

    List<Topic> selectTopicByParentId(Integer parent);
}