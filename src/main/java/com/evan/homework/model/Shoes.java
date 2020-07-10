package com.evan.homework.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Shoes {

    @Column(insertable = false, updatable = false)
    @Setter(AccessLevel.NONE)
    private long sequence;

    @Id
    private String id;
    @Column(insertable = false, updatable = false)

    private int status;
    @Setter(AccessLevel.NONE)
    @Column(insertable = false, updatable = false)
    private Date createTime;

}
