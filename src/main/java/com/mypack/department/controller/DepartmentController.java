package com.mypack.department.controller;

import com.mypack.department.entity.Department;
import com.mypack.department.service.impl.DepartmentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping(value = "department/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Department getDepartmentById(@PathVariable final Long id) {
        log.error("Fetching department details for id: {}", id);
        return departmentService.getDepartmentById(id);
    }

    @GetMapping(value = "department/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Department> getAllDepartments(Long id) {
        return departmentService.getAllDepartments();
    }
}
