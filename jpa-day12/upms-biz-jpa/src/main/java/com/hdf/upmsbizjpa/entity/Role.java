package com.hdf.upmsbizjpa.entity;

import lombok.Data;

import java.util.List;

@Data
public class Role {

    private Integer id;

    private String name;

    private String bh;

    private String miaoshu;

    private List<Menu> menus;

    /**
     * 多对多连接口
     */
    private int mid;

}
