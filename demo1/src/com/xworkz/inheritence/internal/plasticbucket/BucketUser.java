package com.xworkz.inheritence.internal.plasticbucket;

public class BucketUser {
    public void use(SteelBucket bucket) {
        bucket.store();
        bucket.carry();
        bucket.fill();
        bucket.empty();
        bucket.clean();

        if (bucket instanceof PlasticBucket) {
            System.out.println("bucket is instance of PlasticBucket");
            PlasticBucket plastic = (PlasticBucket) bucket;
            plastic.recycle();
        }
    }
}
