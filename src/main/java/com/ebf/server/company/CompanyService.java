package com.ebf.server.company;

import com.ebf.server.employee.Employee;
import com.ebf.server.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Company> getCompanies() {
        List<Company> companies = new ArrayList<>();
        companyRepository.findAll().forEach(companies::add);
        return companies;
    }

    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }

    public void deleteCompany(long id) {
        employeeRepository.deleteEmployeesByCompanyId(id);
        companyRepository.deleteById(id);
    }

    public double averageSalaryByCompanyId(long id) {
        double sum = 0;
        List<Employee> employeeList = employeeRepository.getEmployeesByCompanyId(id);
        if(employeeList.size() == 0) return 0;
        for(Employee employee : employeeList) {
            sum += employee.getSalary();
        }
        return sum / employeeList.size();
    }
}

