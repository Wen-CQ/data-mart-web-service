package com.wen.data.mart.business.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("business")
public class BusinessController {


    @GetMapping("test")
    public String businessTest() {
        return "123";
    }
}
