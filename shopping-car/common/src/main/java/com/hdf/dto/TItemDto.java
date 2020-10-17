package com.hdf.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;


@Getter
@Setter
public class TItemDto extends Page {

    private int id;

    private String itemName;

    private String itemImage;

    private String itemDesc;

    private Integer itemPrice;

    private String itemBrand;

    private String itemColor;

    private String itemSales;

    private Timestamp createTime;


    private int sort;//1 价格  2 销量
}
