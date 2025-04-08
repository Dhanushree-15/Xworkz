package com.xworkz.inheritence.internal.sugar;

import com.xworkz.inheritence.internal.sugar.Sugar;
import com.xworkz.inheritence.internal.sugar.BrownSugar;

public class SugarUser {
    public void useSugar(Sugar sugar) {
        if (sugar instanceof BrownSugar) {
            BrownSugar brown = (BrownSugar) sugar;
            brown.caramelize();
        } else {
            System.out.println("This is not BrownSugar.");
        }
    }
}
