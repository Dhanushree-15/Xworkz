package com.xworkz.LessonRunner;

import com.xworkz.Lesson.*;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(94, "Airplane", 920.5);
        System.out.println(airplane);
        System.out.println(airplane.hashCode());
        System.out.println("Original: " + System.identityHashCode(airplane));
        Airplane airplane1 = new Airplane(2, "Boeing 747", 950.5);
        Airplane airplane2 = new Airplane(2, "Boeing 747", 950.5);
        Airplane airplane3 = new Airplane(4, "Airbus A380", 1020.0);

        System.out.println(airplane1.toString());
        System.out.println("airplane1 equals airplane2: " + airplane1.equals(airplane2));
        System.out.println("airplane1 equals airplane3: " + airplane1.equals(airplane3));
        System.out.println("****");



        Bag bag1 = new Bag(101, "Backpack", 1200.0);
        Bag bag2 = new Bag(101, "Backpack", 1200.0);
        Bag bag3 = new Bag(102, "Trolley", 3500.0);

        System.out.println(bag1);
        System.out.println(bag1.hashCode());
        System.out.println("Original: " + System.identityHashCode(bag1));


        System.out.println("bag1 equals bag2: " + bag1.equals(bag2));
        System.out.println("bag1 equals bag3: " + bag1.equals(bag3));
        System.out.println("****");

        Bed bed1 = new Bed(501, "Single", 6.5);
        Bed bed2 = new Bed(501, "Single", 6.5);
        Bed bed3 = new Bed(502, "Double", 7.0);

        System.out.println(bed1);
        System.out.println(bed1.hashCode());
        System.out.println("Original: " + System.identityHashCode(bed1));


        System.out.println("bed1 equals bed2: " + bed1.equals(bed2));
        System.out.println("bed1 equals bed3: " + bed1.equals(bed3));
        System.out.println("****");

        Belt belt1 = new Belt(201, "Leather", 42.5);
        Belt belt2 = new Belt(201, "Leather", 42.5);
        Belt belt3 = new Belt(202, "Canvas", 38.0);

        System.out.println(belt1);
        System.out.println(belt1.hashCode());
        System.out.println("Original: " + System.identityHashCode(belt1));

        System.out.println("belt1 equals belt2: " + belt1.equals(belt2)); // true
        System.out.println("belt1 equals belt3: " + belt1.equals(belt3));
        System.out.println("****");

        Bicycle cycle1 = new Bicycle(18, "Hero", 27.5);
        Bicycle cycle2 = new Bicycle(18, "Hero", 27.5);
        Bicycle cycle3 = new Bicycle(21, "Firefox", 29.0);

        System.out.println(cycle1);
        System.out.println(cycle1.hashCode());
        System.out.println("Original: " + System.identityHashCode(cycle1));

        System.out.println("cycle1 equals cycle2: " + cycle1.equals(cycle2)); // true
        System.out.println("cycle1 equals cycle3: " + cycle1.equals(cycle3));
        System.out.println("****");

        Binoculars bino1 = new Binoculars(20, "Nikon", 1.5);
        Binoculars bino2 = new Binoculars(20, "Nikon", 1.5);
        Binoculars bino3 = new Binoculars(25, "Canon", 1.7);

        System.out.println(bino1);
        System.out.println(bino1.hashCode());
        System.out.println("Original: " + System.identityHashCode(bino1));

        System.out.println("bino1 equals bino2: " + bino1.equals(bino2));
        System.out.println("bino1 equals bino3: " + bino1.equals(bino3));
        System.out.println("****");

        Blanket blanket1 = new Blanket(5, "Wool", 2.5);
        Blanket blanket2 = new Blanket(5, "Wool", 2.5);
        Blanket blanket3 = new Blanket(7, "Cotton", 2.0);

        System.out.println(blanket1);
        System.out.println(blanket1.hashCode());
        System.out.println("Original: " + System.identityHashCode(blanket1));
        System.out.println("blanket1 equals blanket2: " + blanket1.equals(blanket2));
        System.out.println("blanket1 equals blanket3: " + blanket1.equals(blanket3));
        System.out.println("****");

        Blender blender1 = new Blender(3, "Philips", 1.2);
        Blender blender2 = new Blender(3, "Philips", 1.2);
        Blender blender3 = new Blender(5, "Bajaj", 1.5);

        System.out.println(blender1);
        System.out.println(blender1.hashCode());
        System.out.println("Original: " + System.identityHashCode(blender1));

        System.out.println("blender1 equals blender2: " + blender1.equals(blender2));
        System.out.println("blender1 equals blender3: " + blender1.equals(blender3));
        System.out.println("****");

        Boat boat1 = new Boat(12, "Fishing", 15.5);
        Boat boat2 = new Boat(12, "Fishing", 15.5);
        Boat boat3 = new Boat(8, "Speed", 10.0);

        System.out.println(boat1);
        System.out.println(boat1.hashCode());
        System.out.println("Original: " + System.identityHashCode(boat1));

        System.out.println("boat1 equals boat2: " + boat1.equals(boat2)); // true
        System.out.println("boat1 equals boat3: " + boat1.equals(boat3));
        System.out.println("****");

        Book book = new Book(10, "Book", 1.1);
        System.out.println(book);
        System.out.println(book.hashCode());
        System.out.println("Original: " + System.identityHashCode(book));
        System.out.println("****");

        Book book1 = new Book(300, "Java Basics", 499.99);
        Book book2 = new Book(300, "Java Basics", 499.99);
        Book book3 = new Book(200, "Python Guide", 399.50);

        System.out.println(book1);
        System.out.println(book1.hashCode());
        System.out.println("Original: " + System.identityHashCode(book1));

        System.out.println("book1 equals book2: " + book1.equals(book2));
        System.out.println("book1 equals book3: " + book1.equals(book3));
        System.out.println("****");

        Bottle bottle1 = new Bottle(1000, "Plastic", 25.5);
        Bottle bottle2 = new Bottle(1000, "Plastic", 25.5);
        Bottle bottle3 = new Bottle(750, "Glass", 20.0);

        System.out.println(bottle1);
        System.out.println(bottle1.hashCode());
        System.out.println("Original: " + System.identityHashCode(bottle1));

        System.out.println("bottle1 equals bottle2: " + bottle1.equals(bottle2)); // true
        System.out.println("bottle1 equals bottle3: " + bottle1.equals(bottle3));
        System.out.println("****");

        Bowl bowl1 = new Bowl(500, "Ceramic", 12.5);
        Bowl bowl2 = new Bowl(500, "Ceramic", 12.5);
        Bowl bowl3 = new Bowl(700, "Plastic", 13.0);

        System.out.println(bowl1);
        System.out.println("hashCode: " + bowl1.hashCode());
        System.out.println("Original: " + System.identityHashCode(bowl1));
        System.out.println("Comparing bowl1 and bowl2: " + bowl1.equals(bowl2));
        System.out.println("Comparing bowl1 and bowl3: " + bowl1.equals(bowl3));
        System.out.println("****");

        Brush brush1 = new Brush(1000, "Toothbrush", 7.5);
        Brush brush2 = new Brush(1000, "Toothbrush", 7.5);
        Brush brush3 = new Brush(800, "Paintbrush", 9.0);

        System.out.println(brush1);
        System.out.println("hashCode: " + brush1.hashCode());
        System.out.println("Original: " + System.identityHashCode(brush1));
        System.out.println("Comparing brush1 and brush2: " + brush1.equals(brush2));
        System.out.println("Comparing brush1 and brush3: " + brush1.equals(brush3));
        System.out.println("****");

        Bus bus1 = new Bus(50, "KSRTC", 25.0);
        Bus bus2 = new Bus(50, "KSRTC", 25.0);
        Bus bus3 = new Bus(40, "CityBus", 15.0);

        System.out.println(bus1);
        System.out.println("hashCode: " + bus1.hashCode());
        System.out.println("Original: " + System.identityHashCode(bus1));
        System.out.println("Comparing bus1 and bus2: " + bus1.equals(bus2));
        System.out.println("Comparing bus1 and bus3: " + bus1.equals(bus3));
        System.out.println("****");

        Calculator c1 = new Calculator(24, "Casio", 399.99);
        Calculator c2 = new Calculator(24, "Casio", 399.99);
        Calculator c3 = new Calculator(20, "Citizen", 299.99);

        System.out.println(c1);
        System.out.println("hashCode: " + c1.hashCode());
        System.out.println("Original: " + System.identityHashCode(c1));
        System.out.println("Comparing c1 and c2: " + c1.equals(c2));
        System.out.println("Comparing c1 and c3: " + c1.equals(c3));
        System.out.println("****");

        Camera camera1 = new Camera(24, "Canon", 59999.99);
        Camera camera2 = new Camera(24, "Canon", 59999.99);
        Camera camera3 = new Camera(20, "Nikon", 45999.00);

        System.out.println(camera1);
        System.out.println("hashCode: " + camera1.hashCode());
        System.out.println("Original: " + System.identityHashCode(camera1));

        System.out.println("Comparing camera1 and camera2: " + camera1.equals(camera2));
        System.out.println("Comparing camera1 and camera3: " + camera1.equals(camera3));
        System.out.println("****");

        Can can1 = new Can(5, "Plastic", 49.99);
        Can can2 = new Can(5, "Plastic", 49.99);
        Can can3 = new Can(10, "Steel", 99.99);

        System.out.println(can1);
        System.out.println("hashCode: " + can1.hashCode());
        System.out.println("Original: " + System.identityHashCode(can1));

        System.out.println("Comparing can1 and can2: " + can1.equals(can2));
        System.out.println("Comparing can1 and can3: " + can1.equals(can3));
        System.out.println("****");

        Candle candle1 = new Candle(10, "Red", 5.5);
        Candle candle2 = new Candle(10, "Red", 5.5);
        Candle candle3 = new Candle(12, "White", 6.0);

        System.out.println(candle1);
        System.out.println("hashCode: " + candle1.hashCode());
        System.out.println("Original: " + System.identityHashCode(candle1));

        System.out.println("Comparing candle1 and candle2: " + candle1.equals(candle2));
        System.out.println("Comparing candle1 and candle3: " + candle1.equals(candle3));
        System.out.println("****");

        Cap cap1 = new Cap(7, "Blue", 149.99);
        Cap cap2 = new Cap(7, "Blue", 149.99);
        Cap cap3 = new Cap(8, "Black", 159.49);

        System.out.println(cap1);
        System.out.println("hashCode: " + cap1.hashCode());
        System.out.println("Original: " + System.identityHashCode(cap1));

        System.out.println("Comparing cap1 and cap2: " + cap1.equals(cap2));
        System.out.println("Comparing cap1 and cap3: " + cap1.equals(cap3));
        System.out.println("****");

        Car car1 = new Car(2021, "Tesla", 49999.99);
        Car car2 = new Car(2021, "Tesla", 49999.99);
        Car car3 = new Car(2022, "BMW", 59999.99);

        System.out.println(car1);
        System.out.println("hashCode: " + car1.hashCode());
        System.out.println("Original: " + System.identityHashCode(car1));

        System.out.println("Comparing car1 and car2: " + car1.equals(car2));
        System.out.println("Comparing car1 and car3: " + car1.equals(car3));
        System.out.println("****");

        Carpet carpet1 = new Carpet(10, "Wool", 1500.75);
        Carpet carpet2 = new Carpet(10, "Wool", 1500.75);
        Carpet carpet3 = new Carpet(12, "Cotton", 1800.50);

        System.out.println(carpet1);
        System.out.println("hashCode: " + carpet1.hashCode());
        System.out.println("Original: " + System.identityHashCode(carpet1));

        System.out.println("Comparing carpet1 and carpet2: " + carpet1.equals(carpet2));
        System.out.println("Comparing carpet1 and carpet3: " + carpet1.equals(carpet3));
        System.out.println("****");

        Chair chair1 = new Chair(4, "Wood", 1.2);
        Chair chair2 = new Chair(4, "Wood", 1.2);
        Chair chair3 = new Chair(3, "Plastic", 1.0);

        System.out.println(chair1);
        System.out.println("hashCode: " + chair1.hashCode());
        System.out.println("Original: " + System.identityHashCode(chair1));


        System.out.println("Comparing chair1 and chair2: " + chair1.equals(chair2));
        System.out.println("Comparing chair1 and chair3: " + chair1.equals(chair3));
        System.out.println("****");

        Charger charger1 = new Charger(20, "Samsung", 5.0);
        Charger charger2 = new Charger(20, "Samsung", 5.0);
        Charger charger3 = new Charger(15, "Apple", 5.0);

        System.out.println(charger1);
        System.out.println("hashCode: " + charger1.hashCode());
        System.out.println("Original: " + System.identityHashCode(charger1));

        System.out.println("Comparing charger1 and charger2: " + charger1.equals(charger2));
        System.out.println("Comparing charger1 and charger3: " + charger1.equals(charger3));
        System.out.println("****");

        Clock clock1 = new Clock(12, "Rolex", 5.5);
        Clock clock2 = new Clock(12, "Rolex", 5.5);
        Clock clock3 = new Clock(24, "Omega", 5.0);

        System.out.println(clock1);
        System.out.println("hashCode: " + clock1.hashCode());
        System.out.println("Original: " + System.identityHashCode(clock1));

        System.out.println("Comparing clock1 and clock2: " + clock1.equals(clock2));
        System.out.println("Comparing clock1 and clock3: " + clock1.equals(clock3));
        System.out.println("****");

        Coin coin1 = new Coin(2023, "INR", 2.0);
        Coin coin2 = new Coin(2023, "INR", 2.0);
        Coin coin3 = new Coin(2021, "USD", 2.5);

        System.out.println(coin1);
        System.out.println("hashCode: " + coin1.hashCode());
        System.out.println("Original: " + System.identityHashCode(coin1));

        System.out.println("Comparing coin1 and coin2: " + coin1.equals(coin2));
        System.out.println("Comparing coin1 and coin3: " + coin1.equals(coin3));
        System.out.println("****");

        Comb comb1 = new Comb(20, "Plastic", 15.5);
        Comb comb2 = new Comb(20, "Plastic", 15.5);
        Comb comb3 = new Comb(18, "Wood", 16.0);

        System.out.println(comb1);
        System.out.println("hashCode: " + comb1.hashCode());
        System.out.println("Original: " + System.identityHashCode(comb1));

        System.out.println("Comparing comb1 and comb2: " + comb1.equals(comb2));
        System.out.println("Comparing comb1 and comb3: " + comb1.equals(comb3));
        System.out.println("****");

        Compass compass1 = new Compass(12, "Magnetic", 5.5);
        Compass compass2 = new Compass(12, "Magnetic", 5.5);
        Compass compass3 = new Compass(10, "Solar", 6.0);

        System.out.println(compass1);
        System.out.println("hashCode: " + compass1.hashCode());
        System.out.println("Original: " + System.identityHashCode(compass1));

        System.out.println("Comparing compass1 and compass2: " + compass1.equals(compass2));
        System.out.println("Comparing compass1 and compass3: " + compass1.equals(compass3));
        System.out.println("****");


        Conditioner conditioner1 = new Conditioner(200, "Lavender", 299.99);
        Conditioner conditioner2 = new Conditioner(200, "Lavender", 299.99);
        Conditioner conditioner3 = new Conditioner(300, "Rose", 399.99);

        System.out.println(conditioner1);
        System.out.println("hashCode: " + conditioner1.hashCode());
        System.out.println("Original: " + System.identityHashCode(conditioner1));

        System.out.println("Comparing conditioner1 and conditioner2: " + conditioner1.equals(conditioner2));
        System.out.println("Comparing conditioner1 and conditioner3: " + conditioner1.equals(conditioner3));
        System.out.println("****");

        Cup cup1 = new Cup(250, "Ceramic", 150.00);
        Cup cup2 = new Cup(250, "Ceramic", 150.00);
        Cup cup3 = new Cup(300, "Glass", 200.00);

        System.out.println(cup1);
        System.out.println("hashCode: " + cup1.hashCode());
        System.out.println("Original: " + System.identityHashCode(cup1));

        System.out.println("Comparing cup1 and cup2: " + cup1.equals(cup2));
        System.out.println("Comparing cup1 and cup3: " + cup1.equals(cup3));
        System.out.println("****");

        Door door1 = new Door(80, "Wood", 5000.00);
        Door door2 = new Door(80, "Wood", 5000.00);
        Door door3 = new Door(90, "Metal", 6000.00);

        System.out.println(door1);
        System.out.println("hashCode: " + door1.hashCode());
        System.out.println("Original: " + System.identityHashCode(door1));

        System.out.println("Comparing door1 and door2: " + door1.equals(door2));
        System.out.println("Comparing door1 and door3: " + door1.equals(door3));
        System.out.println("****");

        Eraser eraser1 = new Eraser(5, "Nataraj", 10.50);
        Eraser eraser2 = new Eraser(5, "Nataraj", 10.50);
        Eraser eraser3 = new Eraser(6, "Faber-Castell", 15.00);

        System.out.println(eraser1);
        System.out.println("hashCode: " + eraser1.hashCode());
        System.out.println("Original: " + System.identityHashCode(eraser1));

        System.out.println("Comparing eraser1 and eraser2: " + eraser1.equals(eraser2));
        System.out.println("Comparing eraser1 and eraser3: " + eraser1.equals(eraser3));
        System.out.println("****");

        Fan fan1 = new Fan(5, "Usha", 75.5);
        Fan fan2 = new Fan(5, "Usha", 75.5);
        Fan fan3 = new Fan(3, "Havells", 60.0);

        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: " + fan2);
        System.out.println("Fan 3: " + fan3);

        System.out.println("HashCode of Fan 1: " + fan1.hashCode());
        System.out.println("HashCode of Fan 2: " + fan2.hashCode());
        System.out.println("HashCode of Fan 3: " + fan3.hashCode());

        System.out.println("Is Fan 1 equal to Fan 2? " + fan1.equals(fan2));
        System.out.println("Is Fan 1 equal to Fan 3? " + fan1.equals(fan3));
        System.out.println("*****");

        Fork fork = new Fork(34, "Fork", 17.1);
        System.out.println(fork);
        System.out.println(fork.hashCode());
        System.out.println("Original: " + System.identityHashCode(fork));
        System.out.println("*****");

        Freezer freezer = new Freezer(35, "Freezer", 54.1);
        System.out.println(freezer);
        System.out.println(freezer.hashCode());
        System.out.println("Original: " + System.identityHashCode(freezer));
        System.out.println("*****");

        Fridge fridge = new Fridge(36, "Fridge", 53.1);
        System.out.println(fridge);
        System.out.println(fridge.hashCode());
        System.out.println("Original: " + System.identityHashCode(fridge));
        System.out.println("*****");

        Glasses glasses = new Glasses(37, "Glasses", 13.1);
        System.out.println(glasses);
        System.out.println(glasses.hashCode());
        System.out.println("Original: " + System.identityHashCode(glasses));
        System.out.println("*****");

        Gloves gloves = new Gloves(38, "Gloves", 62.1);
        System.out.println(gloves);
        System.out.println(gloves.hashCode());
        System.out.println("Original: " + System.identityHashCode(gloves));
        System.out.println("*****");

        Grater grater = new Grater(39, "Grater", 60.1);
        System.out.println(grater);
        System.out.println(grater.hashCode());
        System.out.println("Original: " + System.identityHashCode(grater));
        System.out.println("*****");

        Hat hat = new Hat(40, "Hat", 67.1);
        System.out.println(hat);
        System.out.println(hat.hashCode());
        System.out.println("Original: " + System.identityHashCode(hat));
        System.out.println("*****");

        Helmet helmet = new Helmet(41, "Helmet", 61.1);
        System.out.println(helmet);
        System.out.println(helmet.hashCode());
        System.out.println("Original: " + System.identityHashCode(helmet));
        System.out.println("*****");
        Jacket jacket = new Jacket(42, "Jacket", 63.1);
        System.out.println(jacket);
        System.out.println(jacket.hashCode());
        System.out.println("Original: " + System.identityHashCode(jacket));
        System.out.println("*****");

        Jeans jeans = new Jeans(43, "Jeans", 64.1);
        System.out.println(jeans);
        System.out.println(jeans.hashCode());
        System.out.println("Original: " + System.identityHashCode(jeans));
        System.out.println("*****");

        Keyboard keyboard = new Keyboard(44, "Keyboard", 47.1);
        System.out.println(keyboard);
        System.out.println(keyboard.hashCode());
        System.out.println("Original: " + System.identityHashCode(keyboard));
        System.out.println("*****");

        Key key = new Key(45, "Key", 87.1);
        System.out.println(key);
        System.out.println(key.hashCode());
        System.out.println("Original: " + System.identityHashCode(key));
        System.out.println("*****");

        Kettle kettle = new Kettle(46, "Kettle", 57.1);
        System.out.println(kettle);
        System.out.println(kettle.hashCode());
        System.out.println("Original: " + System.identityHashCode(kettle));
        System.out.println("*****");

        Knife knife = new Knife(47, "Knife", 59.1);
        System.out.println(knife);
        System.out.println(knife.hashCode());
        System.out.println("Original: " + System.identityHashCode(knife));
        System.out.println("*****");

        Lamp lamp = new Lamp(48, "Lamp", 29.1);
        System.out.println(lamp);
        System.out.println(lamp.hashCode());
        System.out.println("Original: " + System.identityHashCode(lamp));
        System.out.println("*****");

        Lantern lantern = new Lantern(49, "Lantern", 92.1);
        System.out.println(lantern);
        System.out.println(lantern.hashCode());
        System.out.println("Original: " + System.identityHashCode(lantern));
        System.out.println("*****");

        Laptop laptop = new Laptop(50, "Laptop", 7.1);
        System.out.println(laptop);
        System.out.println(laptop.hashCode());
        System.out.println("Original: " + System.identityHashCode(laptop));
        System.out.println("*****");

        Lighter lighter = new Lighter(51, "Lighter", 98.1);
        System.out.println(lighter);
        System.out.println(lighter.hashCode());
        System.out.println("Original: " + System.identityHashCode(lighter));
        System.out.println("*****");

        Lock lock = new Lock(52, "Lock", 88.1);
        System.out.println(lock);
        System.out.println(lock.hashCode());
        System.out.println("Original: " + System.identityHashCode(lock));
        System.out.println("*****");

        Map map = new Map(53, "Map", 90.1);
        System.out.println(map);
        System.out.println(map.hashCode());
        System.out.println("Original: " + System.identityHashCode(map));
        System.out.println("*****");

        Marker marker = new Marker(54, "Marker", 44.1);
        System.out.println(marker);
        System.out.println(marker.hashCode());
        System.out.println("Original: " + System.identityHashCode(marker));
        System.out.println("*****");

        Matchbox matchbox = new Matchbox(55, "Matchbox", 99.1);
        System.out.println(matchbox);
        System.out.println(matchbox.hashCode());
        System.out.println("Original: " + System.identityHashCode(matchbox));
        System.out.println("*****");

        Microwave microwave = new Microwave(56, "Microwave", 51.1);
        System.out.println(microwave);
        System.out.println(microwave.hashCode());
        System.out.println("Original: " + System.identityHashCode(microwave));
        System.out.println("*****");

        Mirror mirror = new Mirror(57, "Mirror", 25.1);
        System.out.println(mirror);
        System.out.println(mirror.hashCode());
        System.out.println("Original: " + System.identityHashCode(mirror));
        System.out.println("*****");

        Monitor monitor = new Monitor(58, "Monitor", 48.1);
        System.out.println(monitor);
        System.out.println(monitor.hashCode());
        System.out.println("Original: " + System.identityHashCode(monitor));
        System.out.println("*****");

        Motorcycle motorcycle = new Motorcycle(59, "Motorcycle", 73.1);
        System.out.println(motorcycle);
        System.out.println(motorcycle.hashCode());
        System.out.println("Original: " + System.identityHashCode(motorcycle));
        System.out.println("*****");

        Mouse mouse = new Mouse(60, "Mouse", 46.1);
        System.out.println(mouse);
        System.out.println(mouse.hashCode());
        System.out.println("Original: " + System.identityHashCode(mouse));
        System.out.println("*****");

        Notebook notebook = new Notebook(61, "Notebook", 38.1);
        System.out.println(notebook);
        System.out.println(notebook.hashCode());
        System.out.println("Original: " + System.identityHashCode(notebook));
        System.out.println("*****");

        Note note = new Note(62, "Note", 86.1);
        System.out.println(note);
        System.out.println(note.hashCode());
        System.out.println("Original: " + System.identityHashCode(note));
        System.out.println("*****");


        Oven oven = new Oven(63, "Oven", 52.1);
        System.out.println(oven);
        System.out.println(oven.hashCode());
        System.out.println("Original: " + System.identityHashCode(oven));
        System.out.println("*****");

        Pan pan = new Pan(64, "Pan", 58.1);
        System.out.println(pan);
        System.out.println(pan.hashCode());
        System.out.println("Original: " + System.identityHashCode(pan));
        System.out.println("*****");

        Passport passport = new Passport(65, "Passport", 82.1);
        System.out.println(passport);
        System.out.println(passport.hashCode());
        System.out.println("Original: " + System.identityHashCode(passport));
        System.out.println("*****");

        Pen pen = new Pen(66, "Pen", 4.1);
        System.out.println(pen);
        System.out.println(pen.hashCode());
        System.out.println("Original: " + System.identityHashCode(pen));
        System.out.println("*****");

        Pencil pencil = new Pencil(67, "Pencil", 43.1);
        System.out.println(pencil);
        System.out.println(pencil.hashCode());
        System.out.println("Original: " + System.identityHashCode(pencil));
        System.out.println("*****");

        Phone phone = new Phone(68, "Phone", 6.1);
        System.out.println(phone);
        System.out.println(phone.hashCode());
        System.out.println("Original: " + System.identityHashCode(phone));
        System.out.println("*****");

        Pillow pillow = new Pillow(69, "Pillow", 21.1);
        System.out.println(pillow);
        System.out.println(pillow.hashCode());
        System.out.println("Original: " + System.identityHashCode(pillow));
        System.out.println("*****");

        Plate plate = new Plate(70, "Plate", 18.1);
        System.out.println(plate);
        System.out.println(plate.hashCode());
        System.out.println("Original: " + System.identityHashCode(plate));
        System.out.println("*****");

        Purse purse = new Purse(71, "Purse", 84.1);
        System.out.println(purse);
        System.out.println(purse.hashCode());
        System.out.println("Original: " + System.identityHashCode(purse));
        System.out.println("*****");

        Remote remote = new Remote(72, "Remote", 50.1);
        System.out.println(remote);
        System.out.println(remote.hashCode());
        System.out.println("Original: " + System.identityHashCode(remote));
        System.out.println("*");

        Rope rope = new Rope(73, "Rope", 95.1);
        System.out.println(rope);
        System.out.println(rope.hashCode());
        System.out.println("Original: " + System.identityHashCode(rope));
        System.out.println("*");

        Ruler ruler = new Ruler(74, "Ruler", 39.1);
        System.out.println(ruler);
        System.out.println(ruler.hashCode());
        System.out.println("Original: " + System.identityHashCode(ruler));
        System.out.println("*****");

        Scissors scissors = new Scissors(75, "Scissors", 40.1);
        System.out.println(scissors);
        System.out.println(scissors.hashCode());
        System.out.println("Original: " + System.identityHashCode(scissors));
        System.out.println("*****");

        Scooter scooter = new Scooter(76, "Scooter", 72.1);
        System.out.println(scooter);
        System.out.println(scooter.hashCode());
        System.out.println("Original: " + System.identityHashCode(scooter));
        System.out.println("*****");

        Shampoo shampoo = new Shampoo(77, "Shampoo", 36.1);
        System.out.println(shampoo);
        System.out.println(shampoo.hashCode());
        System.out.println("Original: " + System.identityHashCode(shampoo));
        System.out.println("*****");

        Shirt shirt = new Shirt(78, "Shirt", 65.1);
        System.out.println(shirt);
        System.out.println(shirt.hashCode());
        System.out.println("Original: " + System.identityHashCode(shirt));
        System.out.println("*****");

        Ship ship = new Ship(79, "Ship", 80.1);
        System.out.println(ship);
        System.out.println(ship.hashCode());
        System.out.println("Original: " + System.identityHashCode(ship));
        System.out.println("*****");

        Shoes shoes = new Shoes(80, "Shoes", 15.1);
        System.out.println(shoes);
        System.out.println(shoes.hashCode());
        System.out.println("Original: " + System.identityHashCode(shoes));
        System.out.println("*****");

        Skirt skirt = new Skirt(81, "Skirt", 66.1);
        System.out.println(skirt);
        System.out.println(skirt.hashCode());
        System.out.println("Original: " + System.identityHashCode(skirt));
        System.out.println("*****");

        Soap soap = new Soap(82, "Soap", 35.1);
        System.out.println(soap);
        System.out.println(soap.hashCode());
        System.out.println("Original: " + System.identityHashCode(soap));
        System.out.println("*****");

        Sofa sofa = new Sofa(83, "Sofa", 24.1);
        System.out.println(sofa);
        System.out.println(sofa.hashCode());
        System.out.println("Original: " + System.identityHashCode(sofa));
        System.out.println("*****");

        Socks socks = new Socks(84, "Socks", 69.1);
        System.out.println(socks);
        System.out.println(socks.hashCode());
        System.out.println("Original: " + System.identityHashCode(socks));
        System.out.println("*****");

        Speaker speaker = new Speaker(85, "Speaker", 9.1);
        System.out.println(speaker);
        System.out.println(speaker.hashCode());
        System.out.println("Original: " + System.identityHashCode(speaker));
        System.out.println("*****");

        Spoon spoon = new Spoon(86, "Spoon", 16.1);
        System.out.println(spoon);
        System.out.println(spoon.hashCode());
        System.out.println("Original: " + System.identityHashCode(spoon));
        System.out.println("*****");

        Stapler stapler = new Stapler(87, "Stapler", 41.1);
        System.out.println(stapler);
        System.out.println(stapler.hashCode());
        System.out.println("Original: " + System.identityHashCode(stapler));
        System.out.println("*****");

        Table table = new Table(88, "Table", 3.1);
        System.out.println(table);
        System.out.println(table.hashCode());
        System.out.println("Original: " + System.identityHashCode(table));
        System.out.println("*****");

        Television television = new Television(89, "Television", 10.1);
        System.out.println(television);
        System.out.println(television.hashCode());
        System.out.println("Original: " + System.identityHashCode(television));
        System.out.println("*****");

        Tent tent = new Tent(90, "Tent", 91.1);
        System.out.println(tent);
        System.out.println(tent.hashCode());
        System.out.println("Original: " + System.identityHashCode(tent));
        System.out.println("*****");

        Ticket ticket = new Ticket(91, "Ticket", 81.1);
        System.out.println(ticket);
        System.out.println(ticket.hashCode());
        System.out.println("Original: " + System.identityHashCode(ticket));
        System.out.println("*****");

        Toaster toaster = new Toaster(92, "Toaster", 56.1);
        System.out.println(toaster);
        System.out.println(toaster.hashCode());
        System.out.println("Original: " + System.identityHashCode(toaster));
        System.out.println("*****");

        Toothbrush toothbrush = new Toothbrush(93, "Toothbrush", 33.1);
        System.out.println(toothbrush);
        System.out.println(toothbrush.hashCode());
        System.out.println("Original: " + System.identityHashCode(toothbrush));
        System.out.println("*****");

        Towel towel = new Towel(94, "Towel", 34.1);
        System.out.println(towel);
        System.out.println(towel.hashCode());
        System.out.println("Original: " + System.identityHashCode(towel));
        System.out.println("*****");

        Train train = new Train(95, "Train", 77.1);
        System.out.println(train);
        System.out.println(train.hashCode());
        System.out.println("Original: " + System.identityHashCode(train));
        System.out.println("*****");

        Truck truck = new Truck(96, "Truck", 76.1);
        System.out.println(truck);
        System.out.println(truck.hashCode());
        System.out.println("Original: " + System.identityHashCode(truck));
        System.out.println("****");

        Wallet wallet = new Wallet(97, "Wallet", 83.1);
        System.out.println(wallet);
        System.out.println(wallet.hashCode());
        System.out.println("Original: " + System.identityHashCode(wallet));
        System.out.println("****");

        Watch watch = new Watch(98, "Watch", 12.1);
        System.out.println(watch);
        System.out.println(watch.hashCode());
        System.out.println("Original: " + System.identityHashCode(watch));
        System.out.println("****");

        Window window = new Window(99, "Window", 26.1);
        System.out.println(window);
        System.out.println(window.hashCode());
        System.out.println("Original: " + System.identityHashCode(window));
        System.out.println("****");

    }
}
