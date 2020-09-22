package com.hdf.upmsbizeureka.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;



import com.baomidou.mybatisplus.annotations.Version;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * InnoDB free: 7168 kB
 * </p>
 *
 * @author handingfei
 * @since 2020-09-16
 */
@Data
@Accessors(chain = true)
public class TCar extends Model<TCar> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    private String cname;

    private String trademark;

    private Double rent;

    @TableField(value = "car_type")
    private String car_type;

    @TableField(value = "picurl")
    private String picurl;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createds;

    @TableField(exist = false)
    private String codes;


    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

}
