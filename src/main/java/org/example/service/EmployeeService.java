package org.example.service;
import org.example.model.EmployeeModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {


    List<EmployeeModel> getAllEmployees();
//
//    ResponseEntity<EmployeeModel> getEmployee(Integer id);
//
//    void deleteEmployee(Integer id);
//
//    EmployeeModel saveEmployee();
//
//    EmployeeModel saveEmployee(EmployeeModel employeeModel);
//
//    EmployeeModel updateEmployee(Integer id, EmployeeModel employee);

    void addUsers(EmployeeModel employee);

//    ResponseEntity<EmployeeModel> getEmployee(Integer id);
//
//    void deleteEmployee(Integer id);
//
//    EmployeeModel saveEmployee();
//
//    EmployeeModel saveEmployee(EmployeeModel customer);
//
//    EmployeeModel updateEmployee(Integer id, EmployeeModel employee);

    
}

