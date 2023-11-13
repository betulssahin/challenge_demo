package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(long employeeId){
        employeeRepository.deleteById(employeeId);
    }

    public List<Employee> getEmployeesByCompanyId(Long companyId){
        return employeeRepository.findByCompanyId(companyId);
    }

}
