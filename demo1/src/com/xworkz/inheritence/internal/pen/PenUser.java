package com.xworkz.inheritence.internal.pen;

public class PenUser {
    public void use(Pen pen) {
        pen.write();
        pen.inkFlow();
        pen.cap();
        pen.refill();
        pen.grip();

        if (pen instanceof BallPen) {
            System.out.println("pen is instance of BallPen");
            BallPen bp = (BallPen) pen;
            bp.color();  // custom method
        }
    }
}
