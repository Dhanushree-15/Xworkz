package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.MusicPlayer;

public class MusicPlayerUser {
    private MusicPlayer device;

    public MusicPlayerUser(MusicPlayer device) {
        this.device = device;
        System.out.println("Initializing MusicPlayerUser with MusicPlayer");
    }

    public void playSong() {
        System.out.println("Using the MusicPlayer");
        if (this.device != null) {
            this.device.playSong();
        } else {
            System.err.println("MusicPlayer is not available");
        }
    }
}
