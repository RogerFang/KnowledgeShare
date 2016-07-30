package cn.edu.whu.irlab.dao;

import cn.edu.whu.irlab.model.UserGroup;
import cn.edu.whu.irlab.model.UserGroupKey;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupMapper {
    int deleteByPrimaryKey(UserGroupKey key);

    int insert(UserGroup record);

    int insertSelective(UserGroup record);

    UserGroup selectByPrimaryKey(UserGroupKey key);

    int updateByPrimaryKeySelective(UserGroup record);

    int updateByPrimaryKey(UserGroup record);
}