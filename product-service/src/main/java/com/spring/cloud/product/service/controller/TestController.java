/*
 *Copyright Robert Bosch GmbH. All rights reserved, also regarding any disposal, exploration, reproduction, editing,
 *distribution, as well as in the event of applications for industrial property rights.
 */
package com.spring.cloud.product.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping(value = "/init" ,method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String initTest(){
        return "hello Product service";
    }
}
