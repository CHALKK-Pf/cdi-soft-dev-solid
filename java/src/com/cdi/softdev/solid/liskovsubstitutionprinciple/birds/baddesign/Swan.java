package com.cdi.softdev.solid.liskovsubstitutionprinciple.birds.baddesign;

public class Swan extends Bird {

  @Override
  public void eat() {
    System.out.println("Swans like Poc Corn");
  }

  @Override
  public void fly() {
    System.out.println("Swan:: I believe I can fly!");
  }

  public void swim() {
    System.out.println("Swans can also swim");
  }
}
