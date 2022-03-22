package org.example.service;

import org.example.model.EmployeeModel;
import org.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@Service("employeeService")
public class DefaultEmployeeService implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    //    injecting the repository using the setter
    public DefaultEmployeeService() {
    }

    public void setRepository(EmployeeRepository repository) {
        this.repository = repository;
    }
//
//    public EmployeeModel saveEmployee(EmployeeModel employee) {
//        return repository.saveAndFlush(employee);
//    }
//
//    @Override
//    public EmployeeModel updateEmployee(Integer id, EmployeeModel employee) {
//        return null;
//    }
@Override
public List<EmployeeModel> getAllEmployees() {
//        System.out.println(repository.findAll().get(0));
    return repository.findAll();
}

    @Override
    public void addUsers(EmployeeModel employee) {
        repository.save(employee);

    }


//    @Override
//    public EmployeeModel updateEmployee(Integer id, EmployeeModel employee) {
//        ResponseEntity<EmployeeModel> responseEntity = getEmployee(id);
//        if(responseEntity.getStatusCode().is4xxClientError()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "invalid customer id");
//        }
//        EmployeeModel existingEmployee = responseEntity.getBody();
//        BeanUtils.copyProperties(employee, existingEmployee, "id");
//        return repository.saveAndFlush(existingEmployee);
//    }

}


