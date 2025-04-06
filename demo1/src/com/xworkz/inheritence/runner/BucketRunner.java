package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.plasticbucket.SteelBucket;
import com.xworkz.inheritence.internal.plasticbucket.PlasticBucket;

public class BucketRunner {
    public static void main(String[] args) {
        SteelBucket bucket1 = new SteelBucket();
        bucket1.store();
        bucket1.carry();
        bucket1.fill();
        bucket1.empty();
        bucket1.clean();

        System.out.println("-------------------");
        SteelBucket bucket = new PlasticBucket();
        bucket.store();
        bucket.carry();
        bucket.fill();
        bucket.empty();
        bucket.clean();

        System.out.println("-------------------");
        PlasticBucket plasticBucket = new PlasticBucket();
        plasticBucket.store();
        plasticBucket.carry();
        plasticBucket.fill();
        plasticBucket.empty();
        plasticBucket.clean();
    }
}
