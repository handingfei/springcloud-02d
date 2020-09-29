package com.hdf.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * InnoDB free: 7168 kB
 * </p>
 *
 * @author handingfei
 * @since 2020-09-28
 */
@Data
@Accessors(chain = true)
public class TCarrDto extends Page implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 车牌号码
     */
    private String num;

    /**
     * 车辆品牌
     */
    private String pp;

    /**
     * 发动机号码
     */
    private String number;

    /**
     * 车辆识别号
     */
    private String hao;

    /**
     * 初次登记日期
     */
    private Date createdate;

    private String tname;

    private String cname;


}
