package com.cdi.softdev.solid.interfacesegragation.mediaplayer.gooddesign;


public class WinampMediaPlayer implements AudioMediaPlayer {


  @Override
  public void playAudio() {
    System.out.println("Playing ...... Stairway to Heaven ..............");
  }

}