package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<EmployeeModel> employees = new ArrayList<>();

    public void addEmployee(EmployeeModel employee) {
        employees.add(employee);
    }

    public List<EmployeeModel> getAllEmployees() {
        return employees;
    }
}
