package com.cdi.softdev.solid.interfacesegragation.mediaplayer.baddesign;

import com.cdi.softdev.solid.interfacesegragation.mediaplayer.VideoUnsupportedException;

public class WinampMediaPlayer implements MediaPlayer {

  // Play video is not supported in Winamp player
  public void playVideo() {
    throw new VideoUnsupportedException();
  }

  @Override
  public void playAudio() {
    System.out.println("Playing ...... Stairway to Heaven ..............");

  }
}