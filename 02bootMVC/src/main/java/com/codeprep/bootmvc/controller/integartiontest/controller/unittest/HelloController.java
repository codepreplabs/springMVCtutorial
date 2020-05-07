package com.codeprep.bootmvc.controller.integartiontest.controller.unittest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(Model model){
        model.addAttribute("message", "Spring MVC using spring boot, hello world!!");
        return "hello";
    }
}
