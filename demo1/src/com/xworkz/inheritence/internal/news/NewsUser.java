package com.xworkz.inheritence.internal.news;

public class NewsUser {
    public void follow(News news) {
        news.report();
        news.broadcast();
        news.publish();
        news.politics();
        news.sports();

        if (news instanceof BreakingNews) {
            System.out.println("news is instance of BreakingNews");
            BreakingNews breaking = (BreakingNews) news;
            breaking.alert();
        }
    }
}
