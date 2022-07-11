package com.cdi.softdev.solid.openclosed.employeecard.gooddesign1;


public abstract class Employee {

    protected String firstName;
    protected String lastName;
    protected double annualySalary;

    public Employee(String firstName,
                    String lastName,
                    double annualySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualySalary = annualySalary;
    }

    public abstract double calculateBonus();

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

    //endregion


}
