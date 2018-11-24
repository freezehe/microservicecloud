package com.freeze.springcloud.service.impl;

import com.freeze.springcloud.dao.DeptDao;
import com.freeze.springcloud.entities.Dept;
import com.freeze.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hejiebing
 * @create 2018-11-17-9:51
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
