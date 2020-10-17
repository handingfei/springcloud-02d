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
public class TUser extends Model<TUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String bz;

    private String password;

    private String trueName;

    private String userName;

    private String remarks;

    private Integer age;


    private TRole role;


    private TMenu menu;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
