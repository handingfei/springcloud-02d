package com.hdf.shoppingitemservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "t_item")
public class TItemEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "item_name")
    private String itemName;
    @Basic
    @Column(name = "Item_image")
    private String itemImage;
    @Basic
    @Column(name = "Item_desc")
    private String itemDesc;
    @Basic
    @Column(name = "Item_price")
    private Integer itemPrice;
    @Basic
    @Column(name = "Item_brand")
    private String itemBrand;
    @Basic
    @Column(name = "Item_color")
    private String itemColor;
    @Basic
    @Column(name = "Item_sales")
    private String itemSales;
    @Basic
    @Column(name = "create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;





}
