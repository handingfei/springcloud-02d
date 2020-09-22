package com.hdf.upmsbizeureka.entity;

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
 * @author handingfei
 * @since 2020-09-16
 */
@Data
@Accessors(chain = true)
public class TDriverType extends Model<TDriverType> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tid", type = IdType.AUTO)
    private Integer tid;

    private String code;

    private String name;

    private String include;


    @Override
    protected Serializable pkVal() {
        return this.tid;
    }

}
