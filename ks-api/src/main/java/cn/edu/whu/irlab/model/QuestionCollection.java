package cn.edu.whu.irlab.model;

import java.util.Date;

public class QuestionCollection extends QuestionCollectionKey {
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}