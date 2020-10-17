package com.lianxi.eurekajpa.upload;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "upload.file")
public class UploadProperties {
    private String path;
    private String url;
}
