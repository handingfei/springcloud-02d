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
public class TMenu extends Model<TMenu> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String icon;

    private String name;

    private Integer state;

    private String url;

    private Integer pId;

    private String path;

    private String component;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
