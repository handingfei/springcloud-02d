package com.hdf.dto;

import lombok.Data;

@Data
public class StudentDto extends Page {

    private Integer id;
    private String name;
    private String stuNo;

    private String lesson;
}
