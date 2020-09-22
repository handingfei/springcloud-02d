package com.hdf.hospitaleurekaclient.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;



import com.baomidou.mybatisplus.annotations.Version;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;


@Data
@Accessors(chain = true)
public class Dengji extends Model<Dengji> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String zyh;

    private String name;

    private String sex;

    private Integer age;

    private String dz;

    private String dh;

    private String sfz;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date stadate;

    private Integer ks;

    private Integer ys;

    private Integer cw;


    @TableField(exist = false)
    private String cname;
    @TableField(exist = false)
    private String yname;
    @TableField(exist = false)
    private String kname;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
