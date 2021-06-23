package com.ebf.server.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String surname;
    private String email;
    private String address;
    private double salary;
    private long companyId;

    public Employee() {
    }

    public Employee(long id, String name, String surname, String email, String address, double salary, long companyId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.salary = salary;
        this.companyId = companyId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }
}
