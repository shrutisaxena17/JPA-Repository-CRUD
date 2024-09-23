package com.example.JpaRepositoryCRUD.repo;

import com.example.JpaRepositoryCRUD.entity.Address;
import com.example.JpaRepositoryCRUD.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo  extends JpaRepository<Address,Integer> {
}
