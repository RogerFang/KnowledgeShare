package cn.edu.whu.irlab.dao;

import cn.edu.whu.irlab.model.Answer;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Answer record);

    int insertSelective(Answer record);

    Answer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKey(Answer record);
}