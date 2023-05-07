package com.example.employeeaddress.services;

import com.example.employeeaddress.models.Employee;
import com.example.employeeaddress.repositories.IEmployeeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public void addEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    public Iterable<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long employeeId) {
        return employeeRepo.findById(employeeId);
    }
    @Transactional
    public void modifyEmployeeById(Long employeeId,String firstName, String lastName) {
        employeeRepo.updateById(employeeId,firstName,lastName);
    }

    public void deleteEmployeeById(Long employeeId) {
        employeeRepo.deleteById(employeeId);
    }
}
