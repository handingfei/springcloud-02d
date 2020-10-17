package com.hdf.eurekaclient.entity;

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
 * @since 2020-09-30
 */
@Data
@Accessors(chain = true)
public class TUserDay16 extends Model<TUserDay16> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String uname;

    private String username;

    private String password;

    private Integer type;

    private Date birth;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
