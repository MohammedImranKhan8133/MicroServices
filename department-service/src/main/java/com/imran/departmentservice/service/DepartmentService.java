package com.imran.departmentservice.service;

import com.imran.departmentservice.entity.Department;
import com.imran.departmentservice.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepo departmentRepo;

    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    public Department getDepartmentById(int id) {
        return departmentRepo.findByDepartmentId(id);
    }
}
