package com.api.mock.Mock_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees")
    public List<Employee> getEmployees(){
      return  employeeService.listEmployees();
    }

    @GetMapping(path = "/employeesqueryparam")
    public List<Employee> getEmployeesMetchingQuery(@RequestParam int limit){
        return  employeeService.listEmployeeswithMatchingQuery(limit);
    }


    @GetMapping(path = "/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        return  employeeService.getSpecificEmp(id);
    }

    @PostMapping(path = "/employees")
    public Employee getEmployee(@RequestBody Employee employee){
        return  employeeService.createEmployee(employee);
    }

    @PostMapping(path = "/employeesList")
    public List<Employee> getEmployee(@RequestBody List<Employee> employeeList){
        return  employeeService.createEmployees(employeeList);
    }

    @DeleteMapping(path = "employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }

    @PutMapping(path = "employees/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

}
