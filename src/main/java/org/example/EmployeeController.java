package org.example;
import org.example.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import java.util.List;

//@RestController
//@RequestMapping("/api/details")
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<EmployeeModel> getAllCustomers() {
        return employeeService.getAllEmployees();
    }
//
@RequestMapping("/index")
    public String  login(){
        return "index";
}
@RequestMapping("/welcomePage")
    public String  welcome(){
        return "WelcomePage";
    }

    @RequestMapping("/newEntry")
    public String  newEntry(){
        return "NewEntry";
    }





//    @GetMapping
//    @RequestMapping("{id}")
//    public ResponseEntity<EmployeeModel> getEmployee(@PathVariable Integer id) {
//
//        return employeeService.getEmployee(id);
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//    public void deleteEmployee(@PathVariable Integer id) {
//        employeeService.deleteEmployee(id);
//    }

//    @PostMapping
//    public EmployeeModel saveCustomer(@RequestBody EmployeeModel customer) {
//        return employeeService.saveEmployee();
//    }

//    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
//    public EmployeeModel updateEmployee(@PathVariable Integer id,
//                                   @RequestBody EmployeeModel employee) {
//        return employeeService.updateEmployee(id, employee);



}

