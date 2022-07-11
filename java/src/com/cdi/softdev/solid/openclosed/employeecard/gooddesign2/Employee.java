package com.cdi.softdev.solid.openclosed.employeecard.gooddesign2;

import com.cdi.softdev.solid.openclosed.employeecard.baddesign.EmployeeSeniority;

public class Employee {

    private String firstName;
    private String lastName;
    private double annualySalary;
    private EmployeeSeniority seniority;

    public Employee(String firstName,
                    String lastName,
                    double annualySalary,
                    EmployeeSeniority seniority) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualySalary = annualySalary;
        this.seniority = seniority;
    }

    public double calculateBonus(IBonusCalculator bCalc){
        return bCalc.calculateBonus(this);
    }

    //region getters setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAnnualySalary() {
        return annualySalary;
    }

    public void setAnnualySalary(double annualySalary) {
        this.annualySalary = annualySalary;
    }

    public EmployeeSeniority getSeniority() {
        return seniority;
    }

    public void setSeniority(EmployeeSeniority seniority) {
        this.seniority = seniority;
    }
    //endregion


}
