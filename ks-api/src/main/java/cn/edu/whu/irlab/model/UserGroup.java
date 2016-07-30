package cn.edu.whu.irlab.model;

import java.util.Date;

public class UserGroup extends UserGroupKey {
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}