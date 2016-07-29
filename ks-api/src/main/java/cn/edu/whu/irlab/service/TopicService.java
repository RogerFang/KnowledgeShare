package cn.edu.whu.irlab.service;

import cn.edu.whu.irlab.model.Topic;

import java.util.List;

/**
 * Created by Roger on 2016/7/29.
 */
public interface TopicService {

    int deleteByPrimaryKey(Integer id);

    int insert(Topic record);

    int insertSelective(Topic record);

    Topic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKey(Topic record);

    List<Topic> selectRootTopic();

    List<Topic> selectChildTopic(Integer parent);
}
