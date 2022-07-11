package com.cdi.softdev.solid.liskovsubstitutionprinciple.birds.baddesign;

public class Bird {

  public void eat() {
    System.out.println("Bird:: I can eat.");
  }

  public void fly() {
    System.out.println("Bird:: I can fly.");
  }
}
