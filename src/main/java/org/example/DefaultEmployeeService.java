package org.example;

import org.springframework.beans.BeanUtils;
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

    public void setEmployeeRepository(EmployeeRepository repository) {
        this.repository = repository;
    }


//    public EmployeeModel saveCustomer(EmployeeModel employee) {
//        return repository.saveAndFlush(employee);
//    }




    @Override
    public List<EmployeeModel> getAllEmployees() {
        return repository.findAll();
    }

//    @Override
//    public ResponseEntity<EmployeeModel> getEmployee(Integer id) {
//        Optional<EmployeeModel> optionalEmployee = repository.findById(id);
//        if (optionalEmployee.isPresent()) {
//            return new ResponseEntity<>(optionalEmployee.get(), HttpStatus.OK);
//        }
////        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not found!!");
//
//    }

//    @Override
//    public void deleteEmployee(Integer id) {
//        Optional<EmployeeModel> optionalEmployee = repository.findById(id);
//        if (optionalEmployee.isPresent()) {
//            repository.deleteById(id);
//        } else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer not present to be deleted!!");
//        }
//    }
//    @Override
//    public EmployeeModel saveEmployee() {
//        return repository.saveAndFlush(employee);
//    }

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


