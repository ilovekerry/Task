package com.jnshutask.pojo.servicePojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


public class Aliyun {
    private String accessKeyId="zhongguo";
    private String accessKeySecret;
    private String bucketName;
    private String endPoint;

}
