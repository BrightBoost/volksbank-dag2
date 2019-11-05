package com.volksbank.training.datademo.controllers;

import com.volksbank.training.datademo.models.Demo;
import com.volksbank.training.datademo.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public List<Demo> getDemos(){
        return demoService.getAll();
    }

    @RequestMapping(value = "post", method = RequestMethod.POST)
    public void addDemo(@RequestBody Demo demo){
        demoService.addDemo(demo);
    }

}

