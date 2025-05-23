package com.example.springboot.service;

import com.example.springboot.error.EmployeeNotFoundException;
import com.example.springboot.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeeId()==null || employee.getEmployeeId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(String id){
        return employeeList.stream().filter(emp -> emp.getEmployeeId().equalsIgnoreCase(id)).findFirst().get();
    }

    @Override
    public String deleteEmployeeById(String id) {
        Employee employee =  employeeList.stream().filter(e -> e.getEmployeeId().equals(id)).findFirst().get();
        employeeList.remove(employee);
        return "Employee deleted with Id " + id;
    }

}
