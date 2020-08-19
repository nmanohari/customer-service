package com.mypack.department.service;

import com.mypack.department.entity.Department;

import java.util.List;

public interface IDepartmentService {

    Department getDepartmentById(Long id);

    List<Department> getAllDepartments();
}
