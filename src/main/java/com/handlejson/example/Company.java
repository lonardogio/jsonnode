package com.handlejson.example;

import java.util.ArrayList;

public class Company {

    private String name;
    private String address;
    private ArrayList<Employee> employee;

    public Company() {

    }

    public Company(String name, String address, ArrayList<Employee> employee) {
        this.name = name;
        this.address = address;
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }
}

