package cn.edu.whu.irlab.dao;

import cn.edu.whu.irlab.model.Group;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
}