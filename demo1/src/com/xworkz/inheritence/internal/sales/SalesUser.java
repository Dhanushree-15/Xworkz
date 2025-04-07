package com.xworkz.inheritence.internal.sales;

public class SalesUser {
    public void use(Sales sales) {
        sales.revenue();
        sales.marketing();
        sales.customer();
        sales.discounts();
        sales.global();

        if (sales instanceof OnlineSales) {
            System.out.println("sales is instance of OnlineSales");
            OnlineSales online = (OnlineSales) sales;
            online.trackDelivery();
        }
    }
}
