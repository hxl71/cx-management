package com.chenxi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CommonController {
    @RequestMapping({"/","/index"})
    public String index() {
        return "index";
    }
}
