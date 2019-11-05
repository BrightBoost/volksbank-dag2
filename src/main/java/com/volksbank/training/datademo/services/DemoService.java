package com.volksbank.training.datademo.services;

import com.volksbank.training.datademo.models.Demo;
import com.volksbank.training.datademo.repositories.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public List<Demo> getAll(){
        return demoRepository.findAll();
    }

    public void addDemo(Demo demo){
        demoRepository.save(demo);
    }
}
