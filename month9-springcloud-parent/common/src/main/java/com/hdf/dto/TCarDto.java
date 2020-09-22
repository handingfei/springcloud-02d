package com.hdf.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * InnoDB free: 7168 kB
 * </p>
 *
 * @author handingfei
 * @since 2020-09-16
 */
@Data
public class TCarDto extends Page implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer cid;

    private String cname;

    private String trademark;

    private Double rent;

    private String car_type;

    private String picurl;

    private String codes;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createds;



}
