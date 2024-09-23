package com.example.JpaRepositoryCRUD.repo;

import com.example.JpaRepositoryCRUD.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
