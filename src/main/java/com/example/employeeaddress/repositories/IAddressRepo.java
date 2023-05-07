package com.example.employeeaddress.repositories;

import com.example.employeeaddress.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {
    @Modifying
    @Query(value = "update address set street=:street where address_id=:addressId",nativeQuery = true)
    void updateAddressById(Long addressId, String street);
}
