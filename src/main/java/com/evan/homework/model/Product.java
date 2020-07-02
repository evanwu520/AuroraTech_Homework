package com.evan.homework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Product {

    @Column(insertable = false, updatable = false)
    private long sequence;


    @Id
    private String id;

    private String boxId;
    private String shoesId;

    @Column(insertable = false, updatable = false)
    private Date createTime;

    public long getSequence() {
        return sequence;
    }


    public String getId() {
        return id;
    }

    public String getBoxId() {
        return boxId;
    }
    public void setId(String id) {
        this.id = id;
    }


    public void setBoxId(String boxId) {
        this.boxId = boxId;
    }

    public String getShoesId() {
        return shoesId;
    }

    public void setShoesId(String shoesId) {
        this.shoesId = shoesId;
    }

    public Date getCreateTime() {
        return createTime;
    }


    @Override
    public String toString() {
        return "Product{" +
                "sequence=" + sequence +
                ", id='" + id + '\'' +
                ", boxId='" + boxId + '\'' +
                ", shoesId='" + shoesId + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
