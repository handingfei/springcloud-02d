package com.hdf.jxcauth.entity;

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
 * @since 2020-02-20
 */
@Data
@Accessors(chain = true)
@TableName("t_user")
public class TUser extends Model<TUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String bz;

    private String password;


    @TableField("true_name")
    private String trueName;
    @TableField("user_name")
    private String userName;

    private String remarks;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
