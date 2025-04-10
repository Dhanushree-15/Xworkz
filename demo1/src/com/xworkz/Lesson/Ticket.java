package com.xworkz.Lesson;

public class Ticket {
    private int ticketNumber;     // Unique ID for the ticket
    private String passengerName; // Name of the person holding the ticket
    private double price;         // Price of the ticket

    public Ticket(int ticketNumber, String passengerName, double price) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket [ticketNumber=" + ticketNumber + ", passengerName=" + passengerName + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 18;
    }
}
