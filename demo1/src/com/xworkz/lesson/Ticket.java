package com.xworkz.lesson;

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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Ticket) {
                System.out.println("Ref is Ticket, will compare...");
                Ticket other = (Ticket) obj;
                if ((this.ticketNumber == other.ticketNumber) &&
                (this.passengerName != null && this.passengerName.equals(other.passengerName)) &&
                (this.price == other.price)) {
                    System.out.println("Both tickets are same");
                    return true;
                }
            }
        }
        return false;
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
