package com.handingfei.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Data
@Getter
@Setter
public class TCarEntityDto extends Page implements Serializable {
    private Integer id;
    private String carnum;
    private Date sdate;
    private Date hdate;
    private Integer statusid;
    private Integer personid;
    private Integer recordid;


}
