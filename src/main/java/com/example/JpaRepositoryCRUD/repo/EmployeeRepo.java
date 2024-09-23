package com.example.JpaRepositoryCRUD.repo;

import com.example.JpaRepositoryCRUD.entity.Department;
import com.example.JpaRepositoryCRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo  extends JpaRepository<Employee,Integer> {
}
