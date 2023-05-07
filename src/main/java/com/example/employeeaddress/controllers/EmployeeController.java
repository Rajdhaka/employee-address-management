package com.example.employeeaddress.controllers;

import com.example.employeeaddress.models.Employee;
import com.example.employeeaddress.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }
    @GetMapping(value = "/all")
    public Iterable<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping(value = "/employeeId/{employeeId}")
    public Optional<Employee> getEmployeeId(@PathVariable  Long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }
    @PutMapping(value = "/employeeId/{employeeId}/firstName/{firstName}/lastName/{lastName}")
    public void modifyEmployeeById(@PathVariable Long employeeId,@PathVariable String firstName,@PathVariable String lastName){
        employeeService.modifyEmployeeById(employeeId,firstName,lastName);
    }
    @DeleteMapping(value = "employeeId/{employeeId}")
    public void deleteEmployeeById(@PathVariable Long employeeId){
        employeeService.deleteEmployeeById(employeeId);
    }
}
