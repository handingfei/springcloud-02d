package com.hdf.jxcbiz.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;



import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2020-03-02
 */
@Data
@TableName("t_goods")
public class TGoods extends Model<TGoods> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    private String code;

    @TableField("inventory_quantity")
    private Integer inventoryQuantity;

    @TableField("min_num")
    private Integer minNum;

    private String model;

    private String name;

    private String producer;

    @TableField("purchasing_price")
    private Float purchasingPrice;

    private String remarks;

    @TableField("selling_price")
    private Float sellingPrice;

    private String unit;

    @TableField("type_id")
    private Integer typeId;

    private Integer state;

    @TableField(exist = false)
    private String stateStr;

    public String getStateStr(){
        switch (this.state){
            case 0:
                return "下架";
            case 2:
                return "上架";
        }
        return this.stateStr;
    }
    @TableField("last_purchasing_price")
    private Float lastPurchasingPrice;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
