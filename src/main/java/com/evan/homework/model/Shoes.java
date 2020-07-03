package com.evan.homework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Shoes {

    @Column(insertable = false, updatable = false)
    private long sequence;
    @Id
    private String id;
    @Column(insertable = false, updatable = false)

    private int status;
    private Date createTime;


    public long getSequence() {
        return sequence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Shoes{" +
                "sequence=" + sequence +
                ", id='" + id + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }
}
