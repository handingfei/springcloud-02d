package com.hdf.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class CaidanEntityDto extends Page implements Serializable {
    private int id;
    private String name;
    private Integer cid;
    private String type;
    private Date createdtime;

    private String beginTime;

    private String endTime;


}
