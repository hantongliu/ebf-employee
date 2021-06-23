package com.ebf.server.company;

import com.ebf.server.employee.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@SpringBootTest
class CompanyServiceTest {

    @InjectMocks
    private CompanyService companyService;

    @Mock
    private CompanyRepository companyRepository;

    @Mock
    private EmployeeRepository employeeRepository;

    @Test
    @DisplayName("Test getCompanies")
    void getCompanies() {
        Company company1 = new Company(1L, "Company One");
        Company company2 = new Company(2L, "Company Two");
        List<Company> companies = Arrays.asList(company1, company2);
        given(companyRepository.findAll()).willReturn(companies);

        List<Company> expected = companyService.getCompanies();

        assertEquals(expected, companies);

        verify(companyRepository).findAll();
    }

    @Test
    void updateCompany() {
    }

    @Test
    void deleteCompany() {
    }
}