package com.ebf.server.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployeesByCompanyId(long companyId) {
        return employeeRepository.getEmployeesByCompanyId(companyId);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);
    }

}
