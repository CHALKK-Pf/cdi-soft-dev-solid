package com.cdi.softdev.solid.interfacesegragation.mediaplayer.baddesign;

public class VlcMediaPlayer implements MediaPlayer {
  @Override
  public void playAudio() {
    System.out.println(" Playing ... Smoke on the Water ..........");

  }

  @Override
  public void playVideo() {
    System.out.println(" Playing .. The Empire Strikes Back ..........");

  }
}
