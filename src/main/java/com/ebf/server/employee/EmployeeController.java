package com.ebf.server.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/companies/{companyId}/employees")
    public List<Employee> getCompanies(@PathVariable long companyId) {
        return employeeService.getEmployeesByCompanyId(companyId);
    }

    @PostMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeService.deleteEmployeeById(id);
    }

}
