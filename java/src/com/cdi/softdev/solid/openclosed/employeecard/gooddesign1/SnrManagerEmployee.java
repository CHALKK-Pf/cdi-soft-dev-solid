package com.cdi.softdev.solid.openclosed.employeecard.gooddesign1;

public class SnrManagerEmployee extends Employee{
    public SnrManagerEmployee(String firstName, String lastName, double annualySalary) {
        super(firstName, lastName, annualySalary);
    }

    @Override
    public double calculateBonus() {
        return this.annualySalary*0.15;
    }
}
