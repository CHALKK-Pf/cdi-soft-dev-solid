package com.cdi.softdev.solid.openclosed.employeecard.baddesign;

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

    public double calculateBonus(){
        double percentage = 0;
        switch (this.seniority) {
            case Associate:
                percentage = 0.05;
                break;
            case SnrAssociate:
                percentage = 0.1;
                break;
            case Manager:
                percentage = 0.12;
                break;
            case SnrManager:
                percentage = 0.15;
                break;
            case Director:
                percentage = 0.18;
                break;
        }
        return this.annualySalary*percentage;
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
