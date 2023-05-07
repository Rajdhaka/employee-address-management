package com.example.employeeaddress.controllers;
import com.example.employeeaddress.models.Address;
import com.example.employeeaddress.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping(value = "")
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }
    @GetMapping(value = "/all")
    public Iterable<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    @GetMapping(value = "/addressId/{addressId}")
    public Optional<Address> getAddressById(@PathVariable Long addressId){
        return addressService.getAddressById(addressId);
    }
    @PutMapping(value = "/addressId/{addressId}/street/{street}")
    public void modifyAddressById(@PathVariable Long addressId,@PathVariable String street){
        addressService.modifyAddressById(addressId,street);
    }
    @DeleteMapping(value = "/addressId/{addressId}")
    public void deleteAddressById(@PathVariable Long addressId){
        addressService.deleteAddressById(addressId);
    }

}
