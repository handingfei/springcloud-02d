package com.hdf.studentclient.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("option_log")
public class LogEntity {
    private String method;
    private String uri;
    private String  url;
    private String serverPort;
    private String remoteAddr;
    private String desc;
    private Object[] args;
    private String username;
}
