package com.cdi.softdev.solid.openclosed.employeecard.gooddesign1;

public class DirectorEmployee extends Employee{
    public DirectorEmployee(String firstName, String lastName, double annualySalary) {
        super(firstName, lastName, annualySalary);
    }

    @Override
    public double calculateBonus() {
        return this.annualySalary*0.18;
    }
}
