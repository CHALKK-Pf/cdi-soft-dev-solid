package com.cdi.softdev.solid.liskovsubstitutionprinciple.birds.gooddesign;

public interface SwimmingAnimal  {

  default void swim() {
    System.out.println("I can swim");
  }

}
