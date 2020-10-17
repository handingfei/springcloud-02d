package com.hdf.shopping.cat.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document("cat")
public class Cat {


    private int itemID;

    private int itemNumber;

    private BigDecimal itemPrice;

    private int userID;

    private BigDecimal total;

}
