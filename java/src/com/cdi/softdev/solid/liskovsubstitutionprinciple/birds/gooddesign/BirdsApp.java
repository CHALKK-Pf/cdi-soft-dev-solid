package com.cdi.softdev.solid.liskovsubstitutionprinciple.birds.gooddesign;


import java.util.ArrayList;
import java.util.List;

public class BirdsApp {



  public static void feedTheBirds(List<Bird> birds) {
    birds.forEach(Bird::eat);
  }

  public static void letBirdsFly(List<FlyingBird> birds) {
    birds.forEach(FlyingBird::fly);
  }

  public static void letBirdsSwim(List<SwimmingAnimal> birds) {
    birds.forEach(SwimmingAnimal::swim);
  }

  public static void main(String[] args) {
    List<Bird> birds = new ArrayList<Bird>();
    birds.add(new Bird());
    birds.add(new Penguin());
    birds.add(new Eagle());
    birds.add(new SteamerDuck());
    feedTheBirds(birds);

    List<FlyingBird> flyingBirds = new ArrayList<>();
    flyingBirds.add(new Duck());
    flyingBirds.add(new Eagle());

    letBirdsFly(flyingBirds);

    List<SwimmingAnimal> swimmingAnimals = new ArrayList<>();
    swimmingAnimals.add(new Duck());
    swimmingAnimals.add(new SteamerDuck());
    swimmingAnimals.add(new Penguin());

    letBirdsSwim(swimmingAnimals);


  }
}
