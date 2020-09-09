package com.hdf.dto;

import com.baomidou.mybatisplus.activerecord.Model;
import com.hdf.upms.biz.entity.User;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * InnoDB free: 7168 kB; (`province`) REFER `kylin_hdf/nation`(`id`); (`city`) REFE
 * </p>
 *
 * @author Mht
 * @since 2020-09-08
 */
@Data
@Accessors(chain = true)
public class UserDto extends Page implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * hrID
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 住宅电话
     */
    private String telephone;

    /**
     * 联系地址
     */
    private String address;

    private Integer enabled;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    private String userface;

    private String remark;

    private Integer sex;

    /**
     * 省
     */
    private Integer province;

    /**
     * 城市
     */
    private Integer city;

    /**
     * 区县
     */
    private Integer district;

    private Date birth;



}
