package com.example.JpaRepositoryCRUD.service;

import com.example.JpaRepositoryCRUD.entity.Address;
import com.example.JpaRepositoryCRUD.entity.Employee;
import com.example.JpaRepositoryCRUD.repo.AddressRepo;
import com.example.JpaRepositoryCRUD.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepo employeeRepo;

    @Autowired
    EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo=employeeRepo;
    }

    public void saveEmployee(Employee employee){
        employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Integer id){
        return employeeRepo.findById(id).orElse(null);
    }

    public List<Employee> findAllEmployee(){
        return  employeeRepo.findAll();
    }

    public void updateEmployee(Employee employee){
        employeeRepo.save(employee);
    }

    public void deleteEmployee(Integer id){
        employeeRepo.deleteById(id);
    }
}

