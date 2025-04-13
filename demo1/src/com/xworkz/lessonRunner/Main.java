package com.xworkz.lessonRunner;

import com.xworkz.lesson.*;

public class Main {
        public static void main(String[] args) {

            Airplane airplane = new Airplane(94, "Airplane", 920.5);
            System.out.println(airplane);
            Airplane airplane1 = new Airplane(94, "Airplane", 920.5);
            System.out.println(airplane1);
            System.out.println(airplane.hashCode());
            System.out.println("Original: " + System.identityHashCode(airplane));
            System.out.println("Checking same locations...");
            System.out.println("Airplane is same as Airplane1: " + airplane.equals(airplane1));
            System.out.println("*");

            Bag bag = new Bag(101, "Backpack", 1200.0);
            System.out.println(bag);
            Bag bag1 = new Bag(101, "Backpack", 1200.0);
            System.out.println(bag1);
            System.out.println(bag.hashCode());
            System.out.println("Original: " + System.identityHashCode(bag));
            System.out.println("Checking same locations...");
            System.out.println("Bag is same as Bag1: " + bag.equals(bag1));
            System.out.println("*");

            Bed bed = new Bed(501, "Single", 6.5);
            System.out.println(bed);
            Bed bed1 = new Bed(501, "Single", 6.5);
            System.out.println(bed1);
            System.out.println(bed.hashCode());
            System.out.println("Original: " + System.identityHashCode(bed));
            System.out.println("Checking same locations...");
            System.out.println("Bed is same as Bed1: " + bed.equals(bed1));
            System.out.println("*");

            Belt belt = new Belt(201, "Leather", 42.5);
            System.out.println(belt);
            Belt belt1 = new Belt(201, "Leather", 42.5);
            System.out.println(belt1);
            System.out.println(belt.hashCode());
            System.out.println("Original: " + System.identityHashCode(belt));
            System.out.println("Checking same locations...");
            System.out.println("Belt is same as Belt1: " + belt.equals(belt1));
            System.out.println("*");

            Bicycle bicycle = new Bicycle(18, "Hero", 27.5);
            System.out.println(bicycle);
            Bicycle bicycle1 = new Bicycle(18, "Hero", 27.5);
            System.out.println(bicycle1);
            System.out.println(bicycle.hashCode());
            System.out.println("Original: " + System.identityHashCode(bicycle));
            System.out.println("Checking same locations...");
            System.out.println("Bicycle is same as Bicycle1: " + bicycle.equals(bicycle1));
            System.out.println("*");

            Binoculars binoculars = new Binoculars(20, "Nikon", 1.5);
            System.out.println(binoculars);
            Binoculars binoculars1 = new Binoculars(20, "Nikon", 1.5);
            System.out.println(binoculars1);
            System.out.println(binoculars.hashCode());
            System.out.println("Original: " + System.identityHashCode(binoculars));
            System.out.println("Checking same locations...");
            System.out.println("Binoculars is same as Binoculars1: " + binoculars.equals(binoculars1));
            System.out.println("*");

            Blanket blanket1 = new Blanket(5, "Wool", 2.5);
            System.out.println(blanket1);
            Blanket blanket2 = new Blanket(5, "Wool", 2.5);
            System.out.println(blanket2);
            System.out.println(blanket1.hashCode());
            System.out.println("Original: " + System.identityHashCode(blanket1));
            System.out.println("Checking same locations...");
            System.out.println("Blanket is same as Blanket2: " + blanket1.equals(blanket2));
            System.out.println("*");

            Blender blender = new Blender(3, "Philips", 1.5);
            System.out.println(blender);
            Blender blender1 = new Blender(3, "Philips", 1.5);
            System.out.println(blender1);
            System.out.println(blender.hashCode());
            System.out.println("Original: " + System.identityHashCode(blender));
            System.out.println("Checking same locations...");
            System.out.println("Blender is same as Blender1: " + blender.equals(blender1));
            System.out.println("*");

            Boat boat = new Boat(8, "Fishing", 6.5);
            System.out.println(boat);
            Boat boat1 = new Boat(8, "Fishing", 6.5);
            System.out.println(boat1);
            System.out.println(boat.hashCode());
            System.out.println("Original: " + System.identityHashCode(boat));
            System.out.println("Checking same locations...");
            System.out.println("Boat is same as Boat1: " + boat.equals(boat1));
            System.out.println("*");

            Book book = new Book(300, "Java Programming", 499.99);
            System.out.println(book);
            Book book1 = new Book(300, "Java Programming", 499.99);
            System.out.println(book1);
            System.out.println(book.hashCode());
            System.out.println("Original: " + System.identityHashCode(book));
            System.out.println("Checking same locations...");
            System.out.println("Book is same as Book1: " + book.equals(book1));
            System.out.println("*");

            BottleOpener bottleOpener = new BottleOpener(10, "Steel", 0.25);
            System.out.println(bottleOpener);
            BottleOpener bottleOpener1 = new BottleOpener(10, "Steel", 0.25);
            System.out.println(bottleOpener1);
            System.out.println(bottleOpener.hashCode());
            System.out.println("Original: " + System.identityHashCode(bottleOpener));
            System.out.println("Checking same locations...");
            System.out.println("BottleOpener is same as BottleOpener1: " + bottleOpener.equals(bottleOpener1));
            System.out.println("*");

            Bowl bowl = new Bowl(500, "Ceramic", 15.0);
            System.out.println(bowl);
            Bowl bowl1 = new Bowl(500, "Ceramic", 15.0);
            System.out.println(bowl1);
            System.out.println(bowl.hashCode());
            System.out.println("Original: " + System.identityHashCode(bowl));
            System.out.println("Checking same locations...");
            System.out.println("Bowl is same as Bowl1: " + bowl.equals(bowl1));
            System.out.println("*");

            Brush brush = new Brush(100, "Paint", 18.5);
            System.out.println(brush);
            Brush brush1 = new Brush(100, "Paint", 18.5);
            System.out.println(brush1);
            System.out.println(brush.hashCode());
            System.out.println("Original: " + System.identityHashCode(brush));
            System.out.println("Checking same locations...");
            System.out.println("Brush is same as Brush1: " + brush.equals(brush1));
            System.out.println("*");

            Bus bus = new Bus(45, "KSRTC", 150.0);
            System.out.println(bus);
            Bus bus1 = new Bus(45, "KSRTC", 150.0);
            System.out.println(bus1);
            System.out.println(bus.hashCode());
            System.out.println("Original: " + System.identityHashCode(bus));
            System.out.println("Checking same locations...");
            System.out.println("Bus is same as Bus1: " + bus.equals(bus1));
            System.out.println("*");

            Calculator calculator = new Calculator(24, "Casio", 599.99);
            System.out.println(calculator);
            Calculator calculator1 = new Calculator(24, "Casio", 599.99);
            System.out.println(calculator1);
            System.out.println(calculator.hashCode());
            System.out.println("Original: " + System.identityHashCode(calculator));
            System.out.println("Checking same locations...");
            System.out.println("Calculator is same as Calculator1: " + calculator.equals(calculator1));
            System.out.println("*");

            Camera camera = new Camera(24, "Canon", 45999.0);
            System.out.println(camera);
            Camera camera1 = new Camera(24, "Canon", 45999.0);
            System.out.println(camera1);
            System.out.println(camera.hashCode());
            System.out.println("Original: " + System.identityHashCode(camera));
            System.out.println("Checking same locations...");
            System.out.println("Camera is same as Camera1: " + camera.equals(camera1));
            System.out.println("*");

            Can can = new Can(500, "Aluminum", 25.0);
            System.out.println(can);
            Can can1 = new Can(500, "Aluminum", 25.0);
            System.out.println(can1);
            System.out.println(can.hashCode());
            System.out.println("Original: " + System.identityHashCode(can));
            System.out.println("Checking same locations...");
            System.out.println("Can is same as Can1: " + can.equals(can1));
            System.out.println("*");

            Candle candle = new Candle(10, "Red", 5.0);
            System.out.println(candle);
            Candle candle1 = new Candle(10, "Red", 5.0);
            System.out.println(candle1);
            System.out.println(candle.hashCode());
            System.out.println("Original: " + System.identityHashCode(candle));
            System.out.println("Checking same locations...");
            System.out.println("Candle is same as Candle1: " + candle.equals(candle1));
            System.out.println("*");

            Cap cap = new Cap(58, "Blue", 300.0);
            System.out.println(cap);
            Cap cap1 = new Cap(58, "Blue", 300.0);
            System.out.println(cap1);
            System.out.println(cap.hashCode());
            System.out.println("Original: " + System.identityHashCode(cap));
            System.out.println("Checking same locations...");
            System.out.println("Cap is same as Cap1: " + cap.equals(cap1));
            System.out.println("*");

            Car car = new Car(2022, "Toyota", 25000.0);
            System.out.println(car);
            Car car1 = new Car(2022, "Toyota", 25000.0);
            System.out.println(car1);
            System.out.println(car.hashCode());
            System.out.println("Original: " + System.identityHashCode(car));
            System.out.println("Checking same locations...");
            System.out.println("Car is same as Car1: " + car.equals(car1));
            System.out.println("*");

            Carpet carpet = new Carpet(10, "Wool", 3000.0);
            System.out.println(carpet);
            Carpet carpet1 = new Carpet(10, "Wool", 3000.0);
            System.out.println(carpet1);
            System.out.println(carpet.hashCode());
            System.out.println("Original: " + System.identityHashCode(carpet));
            System.out.println("Checking same locations...");
            System.out.println("Carpet is same as Carpet1: " + carpet.equals(carpet1));
            System.out.println("*");

            Chair chair = new Chair(4, "Wood", 1.5);
            System.out.println(chair);
            Chair chair1 = new Chair(4, "Wood", 1.5);
            System.out.println(chair1);
            System.out.println(chair.hashCode());
            System.out.println("Original: " + System.identityHashCode(chair));
            System.out.println("Checking same locations...");
            System.out.println("Chair is same as Chair1: " + chair.equals(chair1));
            System.out.println("*");

            Charger charger = new Charger(25, "Samsung", 5.0);
            System.out.println(charger);
            Charger charger1 = new Charger(25, "Samsung", 5.0);
            System.out.println(charger1);
            System.out.println(charger.hashCode());
            System.out.println("Original: " + System.identityHashCode(charger));
            System.out.println("Checking same locations...");
            System.out.println("Charger is same as Charger1: " + charger.equals(charger1));
            System.out.println("*");

            Clock clock = new Clock(12, "Casio", 15.5);
            System.out.println(clock);
            Clock clock1 = new Clock(12, "Casio", 15.5);
            System.out.println(clock1);
            System.out.println(clock.hashCode());
            System.out.println("Original: " + System.identityHashCode(clock));
            System.out.println("Checking same locations...");
            System.out.println("Clock is same as Clock1: " + clock.equals(clock1));
            System.out.println("*");

            Coin coin = new Coin(2021, "USD", 2.5);
            System.out.println(coin);
            Coin coin1 = new Coin(2021, "USD", 2.5);
            System.out.println(coin1);
            System.out.println(coin.hashCode());
            System.out.println("Original: " + System.identityHashCode(coin));
            System.out.println("Checking same locations...");
            System.out.println("Coin is same as Coin1: " + coin.equals(coin1));
            System.out.println("*");

            Comb comb = new Comb(20, "Plastic", 6.5);
            System.out.println(comb);
            Comb comb1 = new Comb(20, "Plastic", 6.5);
            System.out.println(comb1);
            System.out.println(comb.hashCode());
            System.out.println("Original: " + System.identityHashCode(comb));
            System.out.println("Checking same locations...");
            System.out.println("Comb is same as Comb1: " + comb.equals(comb1));
            System.out.println("*");


            Compass compass = new Compass(10, "Magnetic", 3.5);
            System.out.println(compass);
            Compass compass1 = new Compass(10, "Magnetic", 3.5);
            System.out.println(compass1);
            System.out.println(compass.hashCode());
            System.out.println("Original: " + System.identityHashCode(compass));
            System.out.println("Checking same locations...");
            System.out.println("Compass is same as Compass1: " + compass.equals(compass1));
            System.out.println("*");

            Conditioner conditioner = new Conditioner(500, "Lavender", 10.99);
            System.out.println(conditioner);
            Conditioner conditioner1 = new Conditioner(500, "Lavender", 10.99);
            System.out.println(conditioner1);
            System.out.println(conditioner.hashCode());
            System.out.println("Original: " + System.identityHashCode(conditioner));
            System.out.println("Checking same locations...");
            System.out.println("Conditioner is same as Conditioner1: " + conditioner.equals(conditioner1));
            System.out.println("*");

            Cup cup = new Cup(300, "Ceramic", 5.99);
            System.out.println(cup);
            Cup cup1 = new Cup(300, "Ceramic", 5.99);
            System.out.println(cup1);
            System.out.println(cup.hashCode());
            System.out.println("Original: " + System.identityHashCode(cup));
            System.out.println("Checking same locations...");
            System.out.println("Cup is same as Cup1: " + cup.equals(cup1));
            System.out.println("*");

            Door door = new Door(80, "Wood", 150.0);
            System.out.println(door);
            Door door1 = new Door(80, "Wood", 150.0);
            System.out.println(door1);
            System.out.println(door.hashCode());
            System.out.println("Original: " + System.identityHashCode(door));
            System.out.println("Checking same locations...");
            System.out.println("Door is same as Door1: " + door.equals(door1));
            System.out.println("*");

            Eraser eraser = new Eraser(5, "Faber-Castell", 10.0);
            System.out.println(eraser);
            Eraser eraser1 = new Eraser(5, "Faber-Castell", 10.0);
            System.out.println(eraser1);
            System.out.println(eraser.hashCode());
            System.out.println("Original: " + System.identityHashCode(eraser));
            System.out.println("Checking same locations...");
            System.out.println("Eraser is same as Eraser1: " + eraser.equals(eraser1));
            System.out.println("*");

            Fan fan = new Fan(3, "Sony", 75.5);
            System.out.println(fan);
            Fan fan1 = new Fan(3, "Sony", 75.5);
            System.out.println(fan1);
            System.out.println(fan.hashCode());
            System.out.println("Original: " + System.identityHashCode(fan));
            System.out.println("Checking same locations...");
            System.out.println("Fan is same as Fan1: " + fan.equals(fan1));
            System.out.println("*");


            
                }
            }






}


