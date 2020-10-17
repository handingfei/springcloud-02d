package com.hdf.jxc.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodsDto extends  Page {
    private Integer id;

    private String code;

    private Integer inventoryQuantity;

    private Integer minNum;

    private String model;

    private String name;

    private String producer;

    private Float purchasingPrice;

    private String remarks;

    private Float sellingPrice;

    private String unit;

    private Integer typeId;

    private Integer state;

    private Float lastPurchasingPrice;
}
