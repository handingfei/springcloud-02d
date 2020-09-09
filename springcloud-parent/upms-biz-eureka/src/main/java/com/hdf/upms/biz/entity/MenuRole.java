package com.hdf.upms.biz.entity;

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
 * InnoDB free: 7168 kB; (`mid`) REFER `kylin_hdf/menu`(`id`); (`rid`) REFER `kylin
 * </p>
 *
 * @author Mht
 * @since 2020-09-08
 */
@Data
@Accessors(chain = true)
public class MenuRole extends Model<MenuRole> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer mid;

    private Integer rid;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
