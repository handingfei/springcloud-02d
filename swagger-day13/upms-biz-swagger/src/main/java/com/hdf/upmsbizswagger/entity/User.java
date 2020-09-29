package com.hdf.upmsbizswagger.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 实体类
 */
@ApiModel("这是实体类")
@Data
public class User {

    @ApiModelProperty(value = "这是id")
    private int id;

    @ApiModelProperty(value = "这是name")
    private String name;

    @ApiModelProperty(value = "这是password")
    private String password;
}
