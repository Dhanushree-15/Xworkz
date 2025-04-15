package com.xworkz.evileye.Media;

public abstract class Audio {
   int duration;
   String format;
   boolean isPlaying;

   public Audio(int duration,String format,boolean isPlaying ){
       this.duration=duration;
       this.format=format;
       this.isPlaying=isPlaying;

   }
    }

