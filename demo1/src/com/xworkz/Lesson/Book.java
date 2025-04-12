package com.xworkz.Lesson;

public class Book {
    private int pageCount;
    private String title;
    private double price;

    public Book(int pageCount, String title, double price) {
        this.pageCount = pageCount;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [pageCount=" + pageCount + ", title=" + title + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return 93;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Book) {
                System.out.println("ref is Book, will compare...");
                Book b1 = this;
                Book b2 = (Book) obj;

                if (b1.pageCount == b2.pageCount &&
                        b1.price == b2.price &&
                        (b1.title != null && b1.title.equals(b2.title))) {

                    System.out.println("both books are same");
                    return true;
                }
            }
        }
        return false;
    }
}
