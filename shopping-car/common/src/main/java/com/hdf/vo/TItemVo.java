package com.hdf.vo;

import java.sql.Timestamp;


public class TItemVo {
    private int id;
    private String itemName;
    private String itemImage;
    private String itemDesc;
    private Integer itemPrice;
    private String itemBrand;
    private String itemColor;
    private String itemSales;
    private Timestamp createTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }


    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }


    public Integer getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }


    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }


    public String getItemColor() {
        return itemColor;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor;
    }


    public String getItemSales() {
        return itemSales;
    }

    public void setItemSales(String itemSales) {
        this.itemSales = itemSales;
    }


    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }


}
