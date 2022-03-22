package org.example.controller;
import org.example.model.EmployeeModel;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@RestController
@RequestMapping
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<EmployeeModel> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public ModelAndView logedIn(@ModelAttribute EmployeeModel employee){
        ModelAndView modelAndView = new ModelAndView();
        List<EmployeeModel> employees = employeeService.getAllEmployees();
        for(EmployeeModel employee1 : employees){
            if(employee1.getEmail().equals(employee.getEmail())){
                if(employee1.getPassword().equals(employee.getPassword())){
                    employee.setName(employee1.getName());
                    modelAndView.setViewName("WelcomePage");
                    modelAndView.addObject("employee", employee);

                    return modelAndView;
                }
            }
        }
        return new ModelAndView();
    }

    @RequestMapping("/")
    public String login() {
        return "index";
    }

    @RequestMapping("/welcomePage")
    public String welcome() {
        return "WelcomePage";
    }

    @RequestMapping("/logout")
    public String Logout(){
        return "index";
    }

    @RequestMapping("/newEntry")
    public String newEntry() {
        return "NewEntry";
    }


//    @GetMapping("findbyid/{id}")
//    public ResponseEntity<EmployeeModel> getEmployee(@PathVariable Integer id) {
//
//        return employeeService.getEmployee(id);
//    }
//
//    @DeleteMapping("deletebyid/{id}")
//    public void deleteEmployee(@PathVariable Integer id) {
//        employeeService.deleteEmployee(id);
//    }

    @RequestMapping(value = "/newEntry", method = RequestMethod.POST)
    public String addUsers(@ModelAttribute EmployeeModel employee){
        employeeService.addUsers(employee);
        return "NewEntry";
    }

    @RequestMapping("/Back")
    public String ReturnBack()
    {
        return "WelcomePage";
    }
//
//    @PostMapping("save")
//    public EmployeeModel saveEmployee(@RequestBody EmployeeModel employeeModel) {
//        return employeeService.saveEmployee();
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
//    public EmployeeModel updateEmployee(@PathVariable Integer id,
//                                        @RequestBody EmployeeModel employee) {
//        return employeeService.updateEmployee(id, employee);
//
//
//    }

}

