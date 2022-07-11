package com.cdi.softdev.solid.liskovsubstitutionprinciple.birds.gooddesign;


/**
 *  Steamer Duck can't fly
 * https://en.wikipedia.org/wiki/Steamer_duck
 */
public class SteamerDuck extends Bird implements SwimmingAnimal {

  @Override
  public void eat() {
    System.out.println("SteamerDuck:: I prefer ice cream with soda");
  }

  public void swim() {
    System.out.println("Steamer Ducks swim almost as good as Penguins");
  }

}
