package com.mypack.department.dao;

import com.mypack.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDao extends JpaRepository<Department, Long> {
    
}
