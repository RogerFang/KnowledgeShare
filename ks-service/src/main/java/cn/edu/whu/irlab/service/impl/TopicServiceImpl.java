package cn.edu.whu.irlab.service.impl;

import cn.edu.whu.irlab.dao.TopicMapper;
import cn.edu.whu.irlab.model.Topic;
import cn.edu.whu.irlab.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Roger on 2016/7/29.
 */
@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicMapper topicMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return topicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Topic record) {
        return topicMapper.insert(record);
    }

    @Override
    public int insertSelective(Topic record) {
        return topicMapper.insertSelective(record);
    }

    @Override
    public Topic selectByPrimaryKey(Integer id) {
        return topicMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Topic record) {
        return topicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Topic record) {
        return topicMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Topic> selectRootTopic() {
        return topicMapper.selectTopicByParentId(0);
    }

    @Override
    public List<Topic> selectChildTopic(Integer parent) {
        return topicMapper.selectTopicByParentId(parent);
    }
}
