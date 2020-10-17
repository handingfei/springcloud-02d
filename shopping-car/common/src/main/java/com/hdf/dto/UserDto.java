package com.hdf.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements  Serializable {
    private int id;
    private String username;
    private String password;
}
