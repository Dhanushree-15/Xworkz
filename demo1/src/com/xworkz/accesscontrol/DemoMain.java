package com.xworkz.accesscontrol;

public class DemoMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alice";
        p.display();

        Employee e = new Employee();
        e.department = "HR";
        e.showDepartment();

        BankAccount acc = new BankAccount();
        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());

        Car c = new Car();
        c.drive();

        Student s = new Student();
        s.name = "John";
        s.age = 20;
        s.setMarks(85.5);
        s.displayDetails();
    }
}
