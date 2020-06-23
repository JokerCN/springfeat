package com.iquantex.demo.spring.springfeat.external.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class MyBean {

    @Value("${external.config.mybean.name}")
    private String name;
}
