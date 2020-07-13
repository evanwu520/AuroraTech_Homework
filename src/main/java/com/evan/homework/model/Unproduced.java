package com.evan.homework.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;

@Data
@ApiModel
public class Unproduced {




    private String name;
    private String id;

    public Unproduced(String name, String id){

        this.name = name;
        this.id = id;

    }
}
