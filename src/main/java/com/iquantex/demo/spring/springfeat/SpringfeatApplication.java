package com.iquantex.demo.spring.springfeat;

import com.iquantex.demo.spring.springfeat.external.config.AcmeProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan(basePackageClasses = AcmeProperties.class)
public class SpringfeatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringfeatApplication.class, args);
	}

}
