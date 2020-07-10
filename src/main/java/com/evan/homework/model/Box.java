package com.evan.homework.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Data
public class Box {

    @Column(insertable = false, updatable = false)
    @Setter(AccessLevel.NONE)
    private long sequence;
    @Id
    private String id;

    private int status;

    @Column(insertable = false, updatable = false)
    @Setter(AccessLevel.NONE)
    private Date createTime;

}
