package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.handler.DispatcherServletWebRequest;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class MyController {
    @ResponseBody
    @RequestMapping(value = "/saveuser",method = RequestMethod.GET)
    public String saveUser(String username){
        System.out.println("aaaaaaaaddd"+username);
        return "result";
    }

    @RequestMapping(value = "/saveuser2/{id}",method = RequestMethod.GET)
    public String saveUser2(@PathVariable String id){
        System.out.println("aaaaaaaaddd"+id);
        return "result";
    }


}
