package com.emusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vbilenko on 9/24/16.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {

        return "home";
    }

}


