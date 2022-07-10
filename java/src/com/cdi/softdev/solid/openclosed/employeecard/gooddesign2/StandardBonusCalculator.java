package com.cdi.softdev.solid.openclosed.employeecard.gooddesign2;

public class StandardBonusCalculator implements IBonusCalculator{
    @Override
    public double calculateBonus(Employee empl) {
        double percentage = 0;
        switch (empl.getSeniority()) {
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
        return empl.getAnnualySalary()*percentage;
    }
}
