package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.plasticbucket.SteelBucket;
import com.xworkz.inheritence.internal.plasticbucket.PlasticBucket;
import com.xworkz.inheritence.internal.plasticbucket.BucketUser;

public class BucketRunner {
    public static void main(String[] args) {
        SteelBucket bucket = new SteelBucket();
        bucket.store();
        bucket.carry();
        bucket.fill();
        bucket.empty();
        bucket.clean();

        System.out.println("-----------");

        SteelBucket bucket2 = new PlasticBucket();
        bucket2.store();
        bucket2.carry();
        bucket2.fill();
        bucket2.empty();
        bucket2.clean();

        System.out.println("-----------");

        PlasticBucket plasticBucket = new PlasticBucket();
        plasticBucket.store();
        plasticBucket.carry();
        plasticBucket.fill();
        plasticBucket.empty();
        plasticBucket.clean();
        plasticBucket.recycle();

        System.out.println("-----------");

        BucketUser user = new BucketUser();
        user.use(bucket);
        user.use(bucket2);
        user.use(plasticBucket);
    }
}
