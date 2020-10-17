package com.hdf.eurekaservice.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Getter
@Setter
public class Class {

    @TableId(value = "id")
    private int id;

    private String name;

    private String teaname;

    private int fenlei;

    private int deltype;

    private double price;

    private String imgUrl;

    /**
     * 关联关系
     */
    @Max(10)
    @Min(9)
    private Fenlei fenleis;

}
