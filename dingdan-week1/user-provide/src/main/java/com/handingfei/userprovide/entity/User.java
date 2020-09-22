package com.handingfei.userprovide.entity;

import com.baomidou.mybatisplus.annotations.TableField;
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
 * InnoDB free: 7168 kB
 * </p>
 *
 * @author Mht
 * @since 2020-09-14
 */

/**
 * 用户类
 */
@Data
@Accessors(chain = true)
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /*id
    * */
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    /**
     * uname
     */
    @TableField("uname")
    private String uname;

    /**
     * pwsswd
     */
    @TableField("passwd")
    private String passwd;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}
