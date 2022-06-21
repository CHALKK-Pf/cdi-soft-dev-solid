package com.cdi.softdev.solid.interfacesegragation.mediaplayer.gooddesign;

public class VlcMediaPlayer implements VideoMediaPlayer, AudioMediaPlayer {

  @Override
  public void playAudio() {
    System.out.println(" Playing ... Smoke on the Water ..........");

  }

  @Override
  public void playVideo() {
    System.out.println(" Playing .. The Empire Strikes Back ..........");

  }
}
