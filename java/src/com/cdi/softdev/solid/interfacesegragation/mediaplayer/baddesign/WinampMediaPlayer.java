package com.cdi.softdev.solid.interfacesegragation.mediaplayer.baddesign;

public class WinampMediaPlayer implements MediaPlayer {

  @Override
  // Play video is not supported in Winamp player
  public void playVideo() {
    throw new VideoUnsupportedException();
  }

  @Override
  public void playAudio() {
    System.out.println("Playing ...... Stairway to Heaven ..............");

  }
}