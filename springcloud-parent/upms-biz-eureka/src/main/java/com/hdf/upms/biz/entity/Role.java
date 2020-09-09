package com.hdf.upms.biz.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
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
 * @since 2020-09-08
 */
@Data
@Accessors(chain = true)
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    /**
     * 角色名称
     */
    @TableField("nameZh")
    private String nameZh;

    private Date created;

    private String img;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
