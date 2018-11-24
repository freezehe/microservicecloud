package com.freeze.springcloud.controller;

import com.freeze.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author hejiebing
 * @create 2018-11-18-18:40
 */
@RequestMapping("/consumer/dept")
@RestController
public class DeptController_Consumer {

    private static final String URL_PREFIX = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(URL_PREFIX+"/dept/get/"+id,Dept.class);
    }
    @GetMapping("/list")
    public List<Dept> list(){
        return restTemplate.getForObject(URL_PREFIX+"/dept/list",List.class);
    }

}
