package com.co.jhonan.microservice_one.microservice_one.models.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("eureka")
@org.springframework.context.annotation.Configuration
public class Configuration {
	private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
