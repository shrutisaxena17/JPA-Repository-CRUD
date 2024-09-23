package com.example.JpaRepositoryCRUD.service;

import com.example.JpaRepositoryCRUD.entity.Address;
import com.example.JpaRepositoryCRUD.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AddressService {
    private AddressRepo addressRepo;

    @Autowired
    AddressService(AddressRepo addressRepo){
        this.addressRepo=addressRepo;
    }

    public void saveAddress(Address address){
        addressRepo.save(address);
    }

    public Address findAddressById(Integer id){
        return addressRepo.findById(id).orElse(null);
    }

    public List<Address> findAllAddress(){
        return  addressRepo.findAll();
    }

    public void updateAddress(Address address){
        addressRepo.save(address);
    }

    public void deleteAddress(Integer id){
        addressRepo.deleteById(id);
    }
}
