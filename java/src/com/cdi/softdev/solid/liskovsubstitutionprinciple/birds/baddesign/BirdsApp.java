package com.cdi.softdev.solid.liskovsubstitutionprinciple.birds.baddesign;

import java.util.ArrayList;
import java.util.List;

public class BirdsApp {

  public static void letBirdsFly(List<Bird> birds) {
    birds.forEach(Bird::fly);
  }

  public static void feedTheBirds(List<Bird> birds) {
    birds.forEach(Bird::eat);
  }

  public static void main(String[] args) {
    List<Bird> birds = new ArrayList<Bird>();
    birds.add(new Bird());
    birds.add(new Swan());
    birds.add(new Penguin());

    feedTheBirds(birds);

    letBirdsFly(birds);
  }
}
