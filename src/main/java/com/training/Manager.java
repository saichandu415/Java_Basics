package com.training;


// Single Inheritance & multiple Implementations
public class Manager extends Employee implements EmployeeNecessities{

    @Override
    public int getMinSalary() {
        return 100000;
    }

    @Override
    public String getWorkTimings() {
        return "9-6";
    }

    @Override
    public String getRole() {
        return "Project Manager";
    }
}
