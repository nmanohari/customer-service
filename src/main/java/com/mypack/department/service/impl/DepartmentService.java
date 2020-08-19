package com.mypack.department.service.impl;

import com.mypack.department.dao.DepartmentDao;
import com.mypack.department.entity.Department;
import com.mypack.department.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public Department getDepartmentById(Long id) {
        return departmentDao.findById(id).orElse(new Department());
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentDao.findAll();
    }

}
