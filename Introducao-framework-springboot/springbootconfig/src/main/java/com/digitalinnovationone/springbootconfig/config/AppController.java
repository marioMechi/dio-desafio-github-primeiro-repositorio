package com.digitalinnovationone.springbootconfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL: Nenhuma}")
    private String dbEnvironmentVariable;

    @GetMapping("/")
    public String getAppMessage(){
       return appMessage;
    }
    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable(){
        return "A seguinte variável de ambiente foi passada:"+ dbEnvironmentVariable;
    }
}
