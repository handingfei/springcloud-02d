package com.hdf.jxcbiz.entity;

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
@Accessors(chain = true)
public class TCustomerReturnListGoods extends Model<TCustomerReturnListGoods> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String code;

    private String model;

    private String name;

    private Integer num;

    private Float price;

    private Float total;

    private String unit;

    private Integer customerReturnListId;

    private Integer typeId;

    private Integer goodsId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
