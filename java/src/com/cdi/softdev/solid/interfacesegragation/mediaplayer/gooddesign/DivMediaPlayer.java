package com.cdi.softdev.solid.interfacesegragation.mediaplayer.gooddesign;


public class DivMediaPlayer implements VideoMediaPlayer, AudioMediaPlayer {
  @Override
  public void playAudio() {
    System.out.println(" Playing ..... Bohemian Rhapsody ..........");
  }

  @Override
  public void playVideo() {
    System.out.println(" Playing .... Dune ..........");
  }
}