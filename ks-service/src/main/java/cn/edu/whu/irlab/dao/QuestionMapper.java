package cn.edu.whu.irlab.dao;

import cn.edu.whu.irlab.model.Question;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}