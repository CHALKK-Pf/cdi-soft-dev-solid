package com.cdi.softdev.solid.interfacesegragation.mediaplayer.gooddesign;


public class DivMediaPlayer implements MediaPlayer {
  @Override
  public void playAudio() {
    System.out.println(" Playing ..... Bohemian Rhapsody ..........");
  }

  @Override
  public void playVideo() {
    System.out.println(" Playing .... Dune ..........");
  }

  @Override
  public void displayImage() {
    System.out.println(" Showing an image of  .... Interface Segregation Principle..........");
  }
}