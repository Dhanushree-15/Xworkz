package com.xworkz.inheritence.internal.puppy;

public class PuppyUser {
    public void use(Puppy puppy) {
        puppy.playful();
        puppy.training();
        puppy.care();
        puppy.bark();
        puppy.cuddle();

        if (puppy instanceof LabradorPuppy) {
            System.out.println("puppy is instance of LabradorPuppy");
            LabradorPuppy lab = (LabradorPuppy) puppy;
            lab.fetch();
        }
    }
}
