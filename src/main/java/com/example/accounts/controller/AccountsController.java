package com.example.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v2")
public class AccountsController {

    @GetMapping("sayHello")
    public String sayHello(){
        return "Ho World";
    }
}
