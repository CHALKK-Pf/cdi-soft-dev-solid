package com.cdi.softdev.solid.liskovsubstitutionprinciple.birds.baddesign;

public class Penguin extends Bird {

  @Override
  public void eat() {
    System.out.println("Penguins like Pizza");
  }

  @Override
  public void fly() {
    throw new UnsupportedOperationException("Help! I cannot fly!");
  }

  public void swim() {
    System.out.println("Penguins can swim better than everyone else");
  }
}
