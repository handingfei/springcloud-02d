package com.hdf.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
public class LianxiEntityDto extends Page implements Serializable {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String address;
    private String phone;
    private String img;

    private Integer cid;

}
