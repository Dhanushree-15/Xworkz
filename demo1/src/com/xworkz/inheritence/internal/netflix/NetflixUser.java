package com.xworkz.inheritence.internal.netflix;

public class NetflixUser {
    public void watch(Netflix netflix) {
        netflix.stream();
        netflix.subscribe();
        netflix.devices();
        netflix.content();
        netflix.offline();

        if (netflix instanceof NetflixSeries) {
            System.out.println("netflix is instance of NetflixSeries");
            NetflixSeries series = (NetflixSeries) netflix;
            series.recommendations();
        }
    }
}
