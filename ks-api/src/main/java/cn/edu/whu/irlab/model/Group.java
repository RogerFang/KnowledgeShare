package cn.edu.whu.irlab.model;

import java.util.Date;

public class Group {
    private Integer id;

    private String name;

    private Integer creatorId;

    private Integer groupClsId;

    private Boolean createMode;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getGroupClsId() {
        return groupClsId;
    }

    public void setGroupClsId(Integer groupClsId) {
        this.groupClsId = groupClsId;
    }

    public Boolean getCreateMode() {
        return createMode;
    }

    public void setCreateMode(Boolean createMode) {
        this.createMode = createMode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}