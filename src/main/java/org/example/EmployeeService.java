package org.example;
import org.example.EmployeeModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {


    List<EmployeeModel> getAllEmployees();

    ResponseEntity<EmployeeModel> getEmployee(Integer id);

    void deleteEmployee(Integer id);

    EmployeeModel saveEmployee();

    EmployeeModel updateEmployee(Integer id, EmployeeModel employee);

    
}

