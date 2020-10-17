package com.hdf.eurekaservice.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class Zhangjie {

    @TableId(value = "id")
    private int id;

    private String num;

    private String name;

    private int sid;

    private String kc;

    private String url;

    /**
     * 关联关系
     */
    @Max(10)
    @Min(9)
    private Top tops;

}
