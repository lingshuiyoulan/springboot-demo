package com.example.demo.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class
 *
 * @author Lanling
 * on 2019/11/23
 */
@RestController
public class RestAction {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
