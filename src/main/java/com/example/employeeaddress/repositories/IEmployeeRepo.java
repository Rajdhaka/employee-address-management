package com.example.employeeaddress.repositories;

import com.example.employeeaddress.models.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
    @Modifying
    @Query(value = "update employee set first_name=:firstName,last_name=:lastName where employee_id=:employeeId",nativeQuery = true)
    void updateById(Long employeeId,String firstName,String lastName);
}
