package com.cdi.softdev.solid.liskovsubstitutionprinciple.birds.gooddesign;

public class Eagle extends FlyingBird {

  public void eat() {
    System.out.println("Eagle:: I want tacos");
  }

  public void fly() {
    System.out.println("Eagles fly high");
  }


}
