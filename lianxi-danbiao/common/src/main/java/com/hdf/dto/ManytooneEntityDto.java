package com.hdf.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ManytooneEntityDto {

    private int cid;
    private String cname;


}
