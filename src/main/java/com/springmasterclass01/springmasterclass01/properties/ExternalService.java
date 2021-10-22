package com.springmasterclass01.springmasterclass01.properties;

import org.springframework.beans.factory.annotation.Value;

public class ExternalService {

    @Value("${external.service.url}")
    private String url;

    public String getServiceURL() {
        return url;
    }
}
