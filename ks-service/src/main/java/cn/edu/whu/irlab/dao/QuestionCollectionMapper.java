package cn.edu.whu.irlab.dao;

import cn.edu.whu.irlab.model.QuestionCollection;
import cn.edu.whu.irlab.model.QuestionCollectionKey;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionCollectionMapper {
    int deleteByPrimaryKey(QuestionCollectionKey key);

    int insert(QuestionCollection record);

    int insertSelective(QuestionCollection record);

    QuestionCollection selectByPrimaryKey(QuestionCollectionKey key);

    int updateByPrimaryKeySelective(QuestionCollection record);

    int updateByPrimaryKey(QuestionCollection record);
}