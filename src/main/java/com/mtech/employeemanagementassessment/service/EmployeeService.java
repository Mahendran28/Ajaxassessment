package com.mtech.employeemanagementassessment.service;

import com.mtech.employeemanagementassessment.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();

    public Employee getById(int id);

    public void save(Employee employee);

    public void deleteEmployee(int id);


}
