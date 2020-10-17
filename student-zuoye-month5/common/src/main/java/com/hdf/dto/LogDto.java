package com.hdf.dto;

import lombok.Data;


@Data
public class LogDto {

    private String method;
    private String uri;
    private String  url;
    private String serverPort;
    private String remoteAddr;
    private String desc;
    private Object[] args;
    private String username;


}
