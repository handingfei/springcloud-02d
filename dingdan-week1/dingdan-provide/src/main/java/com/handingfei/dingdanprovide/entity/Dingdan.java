package com.handingfei.dingdanprovide.entity;

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
 * @author Mht
 * @since 2020-09-14
 */
@Data
@Accessors(chain = true)
public class Dingdan extends Model<Dingdan> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String idbh;

    private Integer jine;

    private Date createtime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
