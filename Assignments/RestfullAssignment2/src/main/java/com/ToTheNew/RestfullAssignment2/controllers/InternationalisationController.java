package com.ToTheNew.RestfullAssignment2.controllers;

import com.ToTheNew.RestfullAssignment2.daoService.ServiceInternationalisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class InternationalisationController {
    @Autowired
    public ServiceInternationalisation service;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello/{username}")
    public String sayHello(@PathVariable String username, @RequestHeader(value = "Accept-Language",required = false)Locale locale){

        return messageSource.getMessage("hello",new Object[]{username},locale);
    }

}
