package com.xworkz.inheritence.internal.lipstick;

public class LakmeLipstick {
    public void use(Lipstick lipstick) {
        lipstick.color();
        lipstick.shades();
        lipstick.texture();
        lipstick.beauty();
        lipstick.makeup();

        if (lipstick instanceof MatteLipstick) {
            System.out.println("lipstick is instance of MatteLipstick");
            MatteLipstick matte = (MatteLipstick) lipstick;
            matte.matteFinish();
        }
    }
}
