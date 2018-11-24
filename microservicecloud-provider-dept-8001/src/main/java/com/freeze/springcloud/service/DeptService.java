package com.freeze.springcloud.service;

import com.freeze.springcloud.entities.Dept;

import java.util.List;

/**
 * @author hejiebing
 * @create 2018-11-17-9:50
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
