package com.xworkz.Abstrc.Runner;

import com.xworkz.Abstrc.Internal.*;
import com.xworkz.Abstrc.External.*;


public class ConnectorRunner {
    public static void main(String[] args) {
        AC ac = new ACImpl();
        ACUser acUser = new ACUser(ac);
        acUser.coolRoom();

        Alarm alarm = new AlarmImpl();
        AlarmUser alarmUser = new AlarmUser(alarm);
        alarmUser.ring();

        ATM atm = new ATMImpl();
        ATMUser atmUser = new ATMUser(atm);
        atmUser.dispenseCash();

        BarcodeScanner barcode = new BarcodeScannerImpl();
        BarcodeScannerUser barcodeUser = new BarcodeScannerUser(barcode);
        barcodeUser.scanBarcode();

        Bike bike = new BikeImpl();
        BikeUser bikeUser = new BikeUser(bike);
        bikeUser.startEngine();

        Blender blender = new BlenderImpl();
        BlenderUser blenderUser = new BlenderUser(blender);
        blenderUser.blend();

        Bus bus = new BusImpl();
        BusUser busUser = new BusUser(bus);
        busUser.transportPeople();


        Calculator calculator = new CalculatorImpl();
        CalculatorUser calculatorUser = new CalculatorUser(calculator);
        calculatorUser.calculateSum();

        Camera camera = new CameraImpl();
        CameraUser cameraUser = new CameraUser(camera);
        cameraUser.takePhoto();

        Car car = new CarImpl();
        CarUser carUser = new CarUser(car);
        carUser.drive();


        CoffeeMachine coffee = new CoffeeMachineImpl();
        CoffeeMachineUser coffeeUser = new CoffeeMachineUser(coffee);
        coffeeUser.brewCoffee();

        Connector Connector=new ConnectorImpl();
        ConnectorUser ConnectorUser=new ConnectorUser(Connector);
        ConnectorUser.execute();

        Dishwasher dishwasher = new DishwasherImpl();
        DishwasherUser dishwasherUser = new DishwasherUser(dishwasher);
        dishwasherUser.cleanDishes();

        Door door = new DoorImpl();
        DoorUser doorUser = new DoorUser(door);
        doorUser.open();


        Drone drone = new DroneImpl();
        DroneUser droneUser = new DroneUser(drone);
        droneUser.fly();

        Elevator elevator = new ElevatorImpl();
        ElevatorUser elevatorUser = new ElevatorUser(elevator);
        elevatorUser.moveToFloor();

        EmailService email = new EmailServiceImpl();
        EmailServiceUser emailUser = new EmailServiceUser(email);
        emailUser.sendEmail();

        Fan fan = new FanImpl();
        FanUser fanUser = new FanUser(fan);
        fanUser.rotate();

        Flashlight flashlight = new FlashlightImpl();
        FlashlightUser flashlightUser = new FlashlightUser(flashlight);
        flashlightUser.shineLight();

        GameConsole console = new GameConsoleImpl();
        GameConsoleUser consoleUser = new GameConsoleUser(console);
        consoleUser.startGame();

        GPS gps = new GPSImpl();
        GPSUser gpsUser = new GPSUser(gps);
        gpsUser.trackLocation();

        Heater heater = new HeaterImpl();
        HeaterUser heaterUser = new HeaterUser(heater);
        heaterUser.heatRoom();

        LawnMower mower = new LawnMowerImpl();
        LawnMowerUser mowerUser = new LawnMowerUser(mower);
        mowerUser.cutGrass();

        Light light = new LightImpl();
        LightUser lightUser = new LightUser(light);
        lightUser.turnOn();

        MessageService message = new MessageServiceImpl();
        MessageServiceUser messageUser = new MessageServiceUser(message);
        messageUser.sendMessage();

        Microwave microwave = new MicrowaveImpl();
        MicrowaveUser microwaveUser = new MicrowaveUser(microwave);
        microwaveUser.heatFood();

        MusicPlayer musicPlayer = new MusicPlayerImpl();
        MusicPlayerUser musicPlayerUser = new MusicPlayerUser(musicPlayer);
        musicPlayerUser.playSong();

        Notebook notebook = new NotebookImpl();
        NotebookUser notebookUser = new NotebookUser(notebook);
        notebookUser.writeNote();

        Oven oven = new OvenImpl();
        OvenUser ovenUser = new OvenUser(oven);
        ovenUser.bakeCake();

        PassportScanner passport = new PassportScannerImpl();
        PassportScannerUser passportUser = new PassportScannerUser(passport);
        passportUser.scanPassport();

        Printer printer = new PrinterImpl();
        PrinterUser printerUser = new PrinterUser(printer);
        printerUser.printDocument();

        Projector projector = new ProjectorImpl();
        ProjectorUser projectorUser = new ProjectorUser(projector);
        projectorUser.projectImage();

        Radio radio = new RadioImpl();
        RadioUser radioUser = new RadioUser(radio);
        radioUser.playStation();

        Refrigerator fridge = new RefrigeratorImpl();
        RefrigeratorUser fridgeUser = new RefrigeratorUser(fridge);
        fridgeUser.coolItems();

        Robot robot = new RobotImpl();
        RobotUser robotUser = new RobotUser(robot);
        robotUser.performTask();

        Scanner scanner = new ScannerImpl();
        ScannerUser scannerUser = new ScannerUser(scanner);
        scannerUser.scanDocument();

        SecurityCamera security = new SecurityCameraImpl();
        SecurityCameraUser securityUser = new SecurityCameraUser(security);
        securityUser.recordVideo();

        Sensor sensor = new SensorImpl();
        SensorUser sensorUser = new SensorUser(sensor);
        sensorUser.detectMotion();

        SmartLock lock = new SmartLockImpl();
        SmartLockUser lockUser = new SmartLockUser(lock);
        lockUser.lockDoor();

        SpeakerSystem system = new SpeakerSystemImpl();
        SpeakerSystemUser systemUser = new SpeakerSystemUser(system);
        systemUser.amplifySound();

        Speaker speaker = new SpeakerImpl();
        SpeakerUser speakerUser = new SpeakerUser(speaker);
        speakerUser.playSound();

        Thermostat thermostat = new ThermostatImpl();
        ThermostatUser thermostatUser = new ThermostatUser(thermostat);
        thermostatUser.setTemperature();

        TicketMachine ticket = new TicketMachineImpl();
        TicketMachineUser ticketUser = new TicketMachineUser(ticket);
        ticketUser.printTicket();

        Timer timer = new TimerImpl();
        TimerUser timerUser = new TimerUser(timer);
        timerUser.startTimer();

        Toaster toaster = new ToasterImpl();
        ToasterUser toasterUser = new ToasterUser(toaster);
        toasterUser.toastBread();

        Train train = new TrainImpl();
        TrainUser trainUser = new TrainUser(train);
        trainUser.move();

        TV tv = new TVImpl();
        TVUser tvUser = new TVUser(tv);
        tvUser.displayChannel();

        Vacuum vacuum = new VacuumImpl();
        VacuumUser vacuumUser = new VacuumUser(vacuum);
        vacuumUser.cleanFloor();

        Washer washer = new WasherImpl();
        WasherUser washerUser = new WasherUser(washer);
        washerUser.washClothes();

        Watch watch = new WatchImpl();
        WatchUser watchUser = new WatchUser(watch);
        watchUser.showTime();

        Window window = new WindowImpl();
        WindowUser windowUser = new WindowUser(window);
        windowUser.slideOpen();

    }
}
