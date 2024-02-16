package com.mtech.employeemanagementassessment.controller;

import com.mtech.employeemanagementassessment.entity.Employee;
import com.mtech.employeemanagementassessment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("getAllEmployee")
    public List<Employee> getAllEmployee() {

        return employeeService.getAllEmployee();
    }

    @GetMapping("getById/{id}")
    public Employee getById(@PathVariable int id) {

        return employeeService.getById(id);
    }

    @PostMapping("insertEmployee")
    public void save(@RequestBody Employee employee) {
        employeeService.save(employee);
    }

    @DeleteMapping("deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}
