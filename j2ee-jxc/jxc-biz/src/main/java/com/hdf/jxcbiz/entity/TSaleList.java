package com.hdf.jxcbiz.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
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
public class TSaleList extends Model<TSaleList> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Float amountPaid;

    private Float amountPayable;

    private String remarks;

    private Date saleDate;

    private String saleNumber;

    private Integer state;

    private Integer userId;

    private Integer customerId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
