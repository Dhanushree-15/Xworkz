package com.xworkz.LessonRunner;

import com.xworkz.Lesson.*;

public class Main {
    public static void main(String[] args) {
        Airplane airplane=new Airplane(94, "Airplane", 920.5);
        System.out.println(airplane);
        System.out.println(airplane.hashCode());
        System.out.println("Original: "+System.identityHashCode(airplane));
        System.out.println("****");
        Bag bag = new Bag(2, "Bag", 89.1);
        System.out.println(bag);
        System.out.println(bag.hashCode());
        System.out.println("Original: " + System.identityHashCode(bag));
        System.out.println("****");

        Bed bed = new Bed(3, "Bed", 23.1);
        System.out.println(bed);
        System.out.println(bed.hashCode());
        System.out.println("Original: " + System.identityHashCode(bed));
        System.out.println("****");

        Belt belt = new Belt(4, "Belt", 70.1);
        System.out.println(belt);
        System.out.println(belt.hashCode());
        System.out.println("Original: " + System.identityHashCode(belt));
        System.out.println("****");

        Bicycle bicycle = new Bicycle(5, "Bicycle", 71.1);
        System.out.println(bicycle);
        System.out.println(bicycle.hashCode());
        System.out.println("Original: " + System.identityHashCode(bicycle));
        System.out.println("****");

        Binoculars binoculars = new Binoculars(6, "Binoculars", 94.1);
        System.out.println(binoculars);
        System.out.println(binoculars.hashCode());
        System.out.println("Original: " + System.identityHashCode(binoculars));
        System.out.println("****");

        Blanket blanket = new Blanket(7, "Blanket", 22.1);
        System.out.println(blanket);
        System.out.println(blanket.hashCode());
        System.out.println("Original: " + System.identityHashCode(blanket));
        System.out.println("****");

        Blender blender = new Blender(8, "Blender", 55.1);
        System.out.println(blender);
        System.out.println(blender.hashCode());
        System.out.println("Original: " + System.identityHashCode(blender));
        System.out.println("****");

        Boat boat = new Boat(9, "Boat", 79.1);
        System.out.println(boat);
        System.out.println(boat.hashCode());
        System.out.println("Original: " + System.identityHashCode(boat));
        System.out.println("****");

        Book book = new Book(10, "Book", 1.1);
        System.out.println(book);
        System.out.println(book.hashCode());
        System.out.println("Original: " + System.identityHashCode(book));
        System.out.println("****");

        Bottle bottle = new Bottle(11, "Bottle", 5.1);
        System.out.println(bottle);
        System.out.println(bottle.hashCode());
        System.out.println("Original: " + System.identityHashCode(bottle));
        System.out.println("****");

        BottleOpener bottleOpener = new BottleOpener(12, "BottleOpener", 97.1);
        System.out.println(bottleOpener);
        System.out.println(bottleOpener.hashCode());
        System.out.println("Original: " + System.identityHashCode(bottleOpener));
        System.out.println("****");

        Bowl bowl = new Bowl(13, "Bowl", 20.1);
        System.out.println(bowl);
        System.out.println(bowl.hashCode());
        System.out.println("Original: " + System.identityHashCode(bowl));
        System.out.println("****");

        Brush brush = new Brush(14, "Brush", 31.1);
        System.out.println(brush);
        System.out.println(brush.hashCode());
        System.out.println("Original: " + System.identityHashCode(brush));
        System.out.println("****");

        Bus bus = new Bus(15, "Bus", 75.1);
        System.out.println(bus);
        System.out.println(bus.hashCode());
        System.out.println("Original: " + System.identityHashCode(bus));
        System.out.println("****");

        Camera camera = new Camera(16, "Camera", 8.1);
        System.out.println(camera);
        System.out.println(camera.hashCode());
        System.out.println("Original: " + System.identityHashCode(camera));
        System.out.println("****");

        Can can = new Can(17, "Can", 96.1);
        System.out.println(can);
        System.out.println(can.hashCode());
        System.out.println("Original: " + System.identityHashCode(can));
        System.out.println("****");

        Candle candle = new Candle(18, "Candle", 100.1);
        System.out.println(candle);
        System.out.println(candle.hashCode());
        System.out.println("Original: " + System.identityHashCode(candle));
        System.out.println("*****");

        Cap cap = new Cap(19, "Cap", 68.1);
        System.out.println(cap);
        System.out.println(cap.hashCode());
        System.out.println("Original: " + System.identityHashCode(cap));
        System.out.println("*****");

        Carpet carpet = new Carpet(20, "Carpet", 28.1);
        System.out.println(carpet);
        System.out.println(carpet.hashCode());
        System.out.println("Original: " + System.identityHashCode(carpet));
        System.out.println("*****");

        Car car = new Car(21, "Car", 74.1);
        System.out.println(car);
        System.out.println(car.hashCode());
        System.out.println("Original: " + System.identityHashCode(car));
        System.out.println("****");

        Calculator calculator = new Calculator(22, "Calculator", 45.1);
        System.out.println(calculator);
        System.out.println(calculator.hashCode());
        System.out.println("Original: " + System.identityHashCode(calculator));
        System.out.println("****");

        Chair chair = new Chair(23, "Chair", 2.1);
        System.out.println(chair);
        System.out.println(chair.hashCode());
        System.out.println("Original: " + System.identityHashCode(chair));
        System.out.println("****");

        Charger charger = new Charger(24, "Charger", 49.1);
        System.out.println(charger);
        System.out.println(charger.hashCode());
        System.out.println("Original: " + System.identityHashCode(charger));
        System.out.println("*****");

        Clock clock = new Clock(25, "Clock", 30.1);
        System.out.println(clock);
        System.out.println(clock.hashCode());
        System.out.println("Original: " + System.identityHashCode(clock));
        System.out.println("*****");

        Coin coin = new Coin(26, "Coin", 85.1);
        System.out.println(coin);
        System.out.println(coin.hashCode());
        System.out.println("Original: " + System.identityHashCode(coin));
        System.out.println("*****");

        Comb comb = new Comb(27, "Comb", 32.1);
        System.out.println(comb);
        System.out.println(comb.hashCode());
        System.out.println("Original: " + System.identityHashCode(comb));
        System.out.println("*****");

        Compass compass = new Compass(28, "Compass", 93.1);
        System.out.println(compass);
        System.out.println(compass.hashCode());
        System.out.println("Original: " + System.identityHashCode(compass));
        System.out.println("*****");

        Conditioner conditioner = new Conditioner(29, "Conditioner", 37.1);
        System.out.println(conditioner);
        System.out.println(conditioner.hashCode());
        System.out.println("Original: " + System.identityHashCode(conditioner));
        System.out.println("*****");

        Cup cup = new Cup(30, "Cup", 19.1);
        System.out.println(cup);
        System.out.println(cup.hashCode());
        System.out.println("Original: " + System.identityHashCode(cup));
        System.out.println("*****");

        Door door = new Door(31, "Door", 27.1);
        System.out.println(door);
        System.out.println(door.hashCode());
        System.out.println("Original: " + System.identityHashCode(door));
        System.out.println("*****");

        Eraser eraser = new Eraser(32, "Eraser", 42.1);
        System.out.println(eraser);
        System.out.println(eraser.hashCode());
        System.out.println("Original: " + System.identityHashCode(eraser));
        System.out.println("*****");

        Fan fan = new Fan(33, "Fan", 11.1);
        System.out.println(fan);
        System.out.println(fan.hashCode());
        System.out.println("Original: " + System.identityHashCode(fan));
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
