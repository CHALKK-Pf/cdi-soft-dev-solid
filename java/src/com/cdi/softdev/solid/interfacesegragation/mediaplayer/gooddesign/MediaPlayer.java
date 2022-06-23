package com.cdi.softdev.solid.interfacesegragation.mediaplayer.gooddesign;

public interface MediaPlayer extends AudioMediaPlayer, VideoMediaPlayer {
   void displayImage();
}