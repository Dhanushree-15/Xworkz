package com.xworkz.inheritence.internal.lock;

public class GodrejLock {
    public void use(Key key) {
        key.big();
        key.close();
        key.open();
        key.white();
        key.small();

        if (key instanceof Lock) {
            System.out.println("key is instance of Lock");
            Lock lock = (Lock) key;
            lock.secure();
        }
    }
}
