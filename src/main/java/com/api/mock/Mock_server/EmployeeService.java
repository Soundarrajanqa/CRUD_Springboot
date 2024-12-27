package com.api.mock.Mock_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> listEmployees() {
        List<Employee> list = Arrays.asList(
                new Employee(1, "soundar", "email@mail.com"),
                new Employee(2, "Rajan", "raj@mail.com")
        );
        employeeRepository.saveAll(list);
        return employeeRepository.findAll();
    }

    public List<Employee> listEmployeeswithMatchingQuery(int limitSize) {

        return employeeRepository.findAll().stream().limit(limitSize).collect(Collectors.toList());
    }

    public Employee getSpecificEmp(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        if (!byId.isPresent()) {
            throw new IllegalStateException("Id not exists");
        }
        return employeeRepository.findAll().get(id - 1);
    }

    public Employee createEmployee(Employee employee) {

        if (employeeRepository.existsById(employee.getId())) {
            throw new IllegalStateException("ID already exists");
        }
        return employeeRepository.save(employee);

    }

    public List<Employee> createEmployees(List<Employee> listofEmp) {
        return employeeRepository.saveAll(listofEmp);

    }

    public String deleteEmployee(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        if (!byId.isPresent()) {
            throw new IllegalStateException("Id not exists");
        }
        employeeRepository.deleteById(id);
        return "Employee : " + id + " successfully deleted";
    }


    public Employee updateEmployee(int id, Employee employee) {
        if (!employeeRepository.existsById(id)) {
            throw new IllegalStateException("ID not exists");
        }
        employeeRepository.deleteById(id);
        employeeRepository.save(employee);
        return employee;
    }
}
