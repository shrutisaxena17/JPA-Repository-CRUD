package com.example.JpaRepositoryCRUD.service;

import com.example.JpaRepositoryCRUD.entity.Department;
import com.example.JpaRepositoryCRUD.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private DepartmentRepo departmentRepo;

    @Autowired
    DepartmentService(DepartmentRepo departmentRepo){
        this.departmentRepo= departmentRepo;
    }

    public void saveDepartment(Department department){
        departmentRepo.save(department);
    }

    public Department findDepartmentById(Integer id){
        return departmentRepo.findById(id).orElse(null);
    }

    public List<Department> findAllDepartment(){
        return  departmentRepo.findAll();
    }

    public void updateDepartment(Department department){
        departmentRepo.save(department);
    }

    public void deleteDepartment(Integer id){
        departmentRepo.deleteById(id);
    }
}
