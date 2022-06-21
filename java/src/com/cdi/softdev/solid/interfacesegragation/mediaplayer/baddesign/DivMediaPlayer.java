package com.cdi.softdev.solid.interfacesegragation.mediaplayer.baddesign;

public class DivMediaPlayer implements MediaPlayer {
  @Override
  public void playAudio() {
    System.out.println(" Playing ..... Bohemian Rhapsody ..........");
  }

  @Override
  public void playVideo() {
    System.out.println(" Playing .... Dune ..........");
  }
}