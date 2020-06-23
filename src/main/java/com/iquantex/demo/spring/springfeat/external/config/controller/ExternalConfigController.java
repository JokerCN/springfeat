package com.iquantex.demo.spring.springfeat.external.config.controller;

import com.iquantex.demo.spring.springfeat.external.config.AcmeProperties;
import com.iquantex.demo.spring.springfeat.external.config.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalConfigController {

    private MyBean myBean;

    private AcmeProperties acmeProperties;

    @Autowired
    public ExternalConfigController(MyBean myBean, AcmeProperties acmeProperties){
        this.myBean = myBean;
        this.acmeProperties = acmeProperties;
    }

    @GetMapping("/hello")
    public MyBean getMyBean(){
        return myBean;
    }

    @GetMapping("/acme")
    public AcmeProperties getAcmeProperties(){
        return acmeProperties;
    }
}
