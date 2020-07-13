package com.evan.homework.model;

import io.swagger.annotations.ApiModel;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Data
@ApiModel
public class Product {

    @Column(insertable = false, updatable = false)
    @Setter(AccessLevel.NONE)
    private long sequence;


    @Id
    private String id;

    private String boxId;
    private String shoesId;

    @Column(insertable = false, updatable = false)
    @Setter(AccessLevel.NONE)
    private Date createTime;

}
