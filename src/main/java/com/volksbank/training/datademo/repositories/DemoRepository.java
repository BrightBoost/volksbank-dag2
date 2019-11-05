package com.volksbank.training.datademo.repositories;

import com.volksbank.training.datademo.models.Demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoRepository extends CrudRepository<Demo, Long> {

    List<Demo> findAll();

}
