package com.cdi.softdev.solid.liskovsubstitutionprinciple.birds.gooddesign;


public class Penguin extends Bird implements SwimmingAnimal {

  @Override
  public void eat() {
    System.out.println("Penguins like Pizza");
  }


  @Override
  public void swim() {
    System.out.println("Penguins can swim better than everyone else");
  }
}
