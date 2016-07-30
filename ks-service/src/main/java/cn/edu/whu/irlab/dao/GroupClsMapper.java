package cn.edu.whu.irlab.dao;

import cn.edu.whu.irlab.model.GroupCls;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupClsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupCls record);

    int insertSelective(GroupCls record);

    GroupCls selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupCls record);

    int updateByPrimaryKey(GroupCls record);
}