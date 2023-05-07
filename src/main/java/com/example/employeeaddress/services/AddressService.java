package com.example.employeeaddress.services;

import com.example.employeeaddress.models.Address;
import com.example.employeeaddress.models.Employee;
import com.example.employeeaddress.repositories.IAddressRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public Iterable<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Optional<Address>getAddressById(Long addressId) {
       return addressRepo.findById(addressId);
    }


    public void deleteAddressById(Long addressId) {
        addressRepo.deleteById(addressId);
    }

    @Transactional
    public void modifyAddressById(Long addressId, String street) {
        addressRepo.updateAddressById(addressId,street);
    }
}
