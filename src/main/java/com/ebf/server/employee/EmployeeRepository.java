package com.ebf.server.employee;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    public List<Employee> getEmployeesByCompanyId(long id);
    public void deleteEmployeesByCompanyId(long id);
}
