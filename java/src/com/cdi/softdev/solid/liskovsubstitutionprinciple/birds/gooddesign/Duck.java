package com.cdi.softdev.solid.liskovsubstitutionprinciple.birds.gooddesign;

public class Duck extends FlyingBird implements SwimmingAnimal  {

  public void eat() {
    System.out.println("Duck:: I prefer ice cream with soda");
  }

  public void fly() {
    System.out.println("Ducks can fly....");
  }

}
