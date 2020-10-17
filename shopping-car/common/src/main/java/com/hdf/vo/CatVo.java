package com.hdf.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CatVo {


    private int itemID;

    private int itemNumber;

    private BigDecimal itemPrice;

    private int userID;

    private BigDecimal total;

    private  String itemImage;
    private  String  itemName;

}
