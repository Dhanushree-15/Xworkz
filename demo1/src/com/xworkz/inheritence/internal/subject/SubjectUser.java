package com.xworkz.inheritence.internal.subject;

public class SubjectUser {
    public void use(Subject subject) {
        if (subject instanceof com.xworkz.inheritence.internal.subject.Mathematics) {
            com.xworkz.inheritence.internal.subject.Mathematics math = (com.xworkz.inheritence.internal.subject.Mathematics) subject;
            math.equations();
        }
    }
}
