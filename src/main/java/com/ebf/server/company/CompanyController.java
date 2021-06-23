package com.ebf.server.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public List<Company> getCompanies() {
        return companyService.getCompanies();
    }

    @PostMapping("/companies")
    public Company updateCompany(@RequestBody Company company) {
        return companyService.updateCompany(company);
    }

    @DeleteMapping("/companies/{id}")
    public void deleteCompany(@PathVariable long id) {
        companyService.deleteCompany(id);
    }

    @GetMapping("/companies/{id}/averageSalary")
    public String averageSalaryByCompanyId(@PathVariable long id) {
        return String.format("%.2f", companyService.averageSalaryByCompanyId(id));
    }
}
