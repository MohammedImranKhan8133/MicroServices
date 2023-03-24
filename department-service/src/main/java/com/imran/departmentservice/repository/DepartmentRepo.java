package com.imran.departmentservice.repository;

import com.imran.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {
    Department findByDepartmentId(int id);
}
