package com.hdf.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CatDto extends Page {


    private int itemID;

    private int itemNumber;

    private BigDecimal itemPrice;

    private int userID;

    private BigDecimal total;

}
