package com.hdf.carrclient.entity;

import com.baomidou.mybatisplus.annotations.TableField;
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
 * InnoDB free: 7168 kB
 * </p>
 *
 * @author handingfei
 * @since 2020-09-28
 */
@Data
@Accessors(chain = true)
public class TCarr extends Model<TCarr> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 车牌号码
     */
    @TableField(value = "num")
    private String num;

    /**
     * 车辆品牌
     */
    @TableField(value = "pp")
    private String pp;

    /**
     * 发动机号码
     */
    @TableField(value = "number")
    private String number;

    /**
     * 车辆识别号
     */
    @TableField(value = "hao")
    private String hao;

    /**
     * 初次登记日期
     */
    @TableField(value = "createdate")
    private Date createdate;

    @TableField(value = "tname")
    private String tname;

    @TableField(value = "cname")
    private String cname;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
