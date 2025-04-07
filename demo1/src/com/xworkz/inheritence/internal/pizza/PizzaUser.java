package com.xworkz.inheritence.internal.pizza;

public class PizzaUser {
    public void use(Pizza pizza) {
        pizza.crust();
        pizza.sauce();
        pizza.cheese();
        pizza.flavors();
        pizza.cook();

        if (pizza instanceof CheesePizza) {
            System.out.println("pizza is instance of CheesePizza");
            CheesePizza cheese = (CheesePizza) pizza;
            cheese.addToppings();
        }
    }
}
