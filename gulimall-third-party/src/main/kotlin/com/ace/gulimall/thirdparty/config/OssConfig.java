package com.ace.gulimall.thirdparty.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OssConfig {

    @Value("${spring.tencent.cloud.secretKey}")
    private String secretKey;

    @Value("${spring.tencent.cloud.secretId}")
    private String secretId;

    @Value("${spring.tencent.cloud.area}")
    private String area;

    @Value("${spring.tencent.cloud.bucketName}")
    private String bucketName;

    @Value("${spring.tencent.cloud.path}")
    private String path;

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "OssConfig{" +
                "secretKey='" + secretKey + '\'' +
                ", secretId='" + secretId + '\'' +
                ", area='" + area + '\'' +
                ", bucketName='" + bucketName + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
