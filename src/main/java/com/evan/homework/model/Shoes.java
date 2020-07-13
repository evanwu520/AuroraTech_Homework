package com.evan.homework.model;

import io.swagger.annotations.ApiModel;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@ApiModel
public class Shoes {

    @Column(insertable = false, updatable = false)
    @Setter(AccessLevel.NONE)
    private long sequence;

    @Id
    private String id;

    private int status;
    @Setter(AccessLevel.NONE)
    @Column(insertable = false, updatable = false)
    private Date createTime;

}
