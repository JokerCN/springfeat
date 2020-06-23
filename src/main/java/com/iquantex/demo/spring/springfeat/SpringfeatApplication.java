package com.iquantex.demo.spring.springfeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringfeatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringfeatApplication.class, args);
	}

}
