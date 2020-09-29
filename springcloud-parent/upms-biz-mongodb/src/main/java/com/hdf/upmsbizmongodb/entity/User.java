package com.hdf.upmsbizmongodb.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("这是实体类")
@Data
public class User {

    @ApiModelProperty(value = "名称")
    private String name="张三";

    @ApiModelProperty(value = "性别")
    private String sex="男";

}
