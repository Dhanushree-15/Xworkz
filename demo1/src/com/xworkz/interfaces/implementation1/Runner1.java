package com.xworkz.interfaces.implementation1;

public class Runner1 {
    public static void main(String[] args) {
        CarImpl carImpl = new CarImpl();
        carImpl.startEngine();
        carImpl.stopEngine();
        carImpl.honk();

        FanImpl fanImpl = new FanImpl();
        fanImpl.switchOn();
        fanImpl.switchOff();
        fanImpl.rotate();

        PhoneImpl phoneImpl = new PhoneImpl();
        phoneImpl.makeCall();
        phoneImpl.receiveCall();
        phoneImpl.charge();

        LaptopImpl laptopImpl = new LaptopImpl();
        laptopImpl.powerOn();
        laptopImpl.powerOff();
        laptopImpl.runProgram();

        ChairImpl chairImpl = new ChairImpl();
        chairImpl.sit();
        chairImpl.adjustHeight();
        chairImpl.rotate();

        TelevisionImpl televisionImpl = new TelevisionImpl();
        televisionImpl.powerOn();
        televisionImpl.powerOff();
        televisionImpl.changeChannel();

        LightImpl lightImpl = new LightImpl();
        lightImpl.switchOn();
        lightImpl.switchOff();
        lightImpl.dim();

        CameraImpl cameraImpl = new CameraImpl();
        cameraImpl.clickPhoto();
        cameraImpl.recordVideo();
        cameraImpl.zoom();

        PrinterImpl printerImpl = new PrinterImpl();
        printerImpl.print();
        printerImpl.scan();
        printerImpl.copy();

        SpeakerImpl speakerImpl = new SpeakerImpl();
        speakerImpl.playMusic();
        speakerImpl.pause();
        speakerImpl.increaseVolume();

        AirConditionerImpl airConditionerImpl = new AirConditionerImpl();
        airConditionerImpl.turnOn();
        airConditionerImpl.turnOff();
        airConditionerImpl.setTemperature();

        MicrowaveImpl microwaveImpl = new MicrowaveImpl();
        microwaveImpl.start();
        microwaveImpl.stop();
        microwaveImpl.setTimer();

        RefrigeratorImpl refrigeratorImpl = new RefrigeratorImpl();
        refrigeratorImpl.cool();
        refrigeratorImpl.freeze();
        refrigeratorImpl.defrost();

        WashingMachineImpl washingMachineImpl = new WashingMachineImpl();
        washingMachineImpl.wash();
        washingMachineImpl.rinse();
        washingMachineImpl.spin();

        OvenImpl ovenImpl = new OvenImpl();
        ovenImpl.preheat();
        ovenImpl.bake();
        ovenImpl.grill();

        ToasterImpl toasterImpl = new ToasterImpl();
        toasterImpl.insertBread();
        toasterImpl.toast();
        toasterImpl.eject();

        ClockImpl clockImpl = new ClockImpl();
        clockImpl.showTime();
        clockImpl.setAlarm();
        clockImpl.stopAlarm();

        WatchImpl watchImpl = new WatchImpl();
        watchImpl.showTime();
        watchImpl.startTimer();
        watchImpl.stopTimer();

        BlenderImpl blenderImpl = new BlenderImpl();
        blenderImpl.blend();
        blenderImpl.pulse();
        blenderImpl.clean();

        HeaterImpl heaterImpl = new HeaterImpl();
        heaterImpl.turnOn();
        heaterImpl.turnOff();
        heaterImpl.setTemperature();

        ProjectorImpl projectorImpl = new ProjectorImpl();
        projectorImpl.projectImage();
        projectorImpl.adjustFocus();
        projectorImpl.shutDown();

        DroneImpl droneImpl = new DroneImpl();
        droneImpl.takeOff();
        droneImpl.land();
        droneImpl.fly();

        RobotImpl robotImpl = new RobotImpl();
        robotImpl.walk();
        robotImpl.speak();
        robotImpl.grabObject();

        VacuumCleanerImpl vacuumCleanerImpl = new VacuumCleanerImpl();
        vacuumCleanerImpl.start();
        vacuumCleanerImpl.stop();
        vacuumCleanerImpl.changeMode();

        RouterImpl routerImpl = new RouterImpl();
        routerImpl.connect();
        routerImpl.disconnect();
        routerImpl.reset();

        TabletImpl tabletImpl = new TabletImpl();
        tabletImpl.tap();
        tabletImpl.swipe();
        tabletImpl.installApp();

        ScannerImpl scannerImpl = new ScannerImpl();
        scannerImpl.scanDocument();
        scannerImpl.scanImage();
        scannerImpl.preview();

        SmartWatchImpl smartWatchImpl = new SmartWatchImpl();
        smartWatchImpl.trackSteps();
        smartWatchImpl.monitorHeartRate();
        smartWatchImpl.displayTime();

        SpeakerSystemImpl speakerSystemImpl = new SpeakerSystemImpl();
        speakerSystemImpl.turnOn();
        speakerSystemImpl.adjustBass();
        speakerSystemImpl.mute();

        eReaderImpl eReaderImpl = new eReaderImpl();
        eReaderImpl.openBook();
        eReaderImpl.turnPage();
        eReaderImpl.bookmarkPage();

        ThermostatImpl thermostatImpl = new ThermostatImpl();
        thermostatImpl.setTemp();
        thermostatImpl.increaseTemp();
        thermostatImpl.decreaseTemp();

        GameConsoleImpl gameConsoleImpl = new GameConsoleImpl();
        gameConsoleImpl.startGame();
        gameConsoleImpl.pauseGame();
        gameConsoleImpl.saveGame();

        SmartBulbImpl smartBulbImpl = new SmartBulbImpl();
        smartBulbImpl.changeColor();
        smartBulbImpl.dimLight();
        smartBulbImpl.turnOff();

        AirPurifierImpl airPurifierImpl = new AirPurifierImpl();
        airPurifierImpl.purifyAir();
        airPurifierImpl.changeFilter();
        airPurifierImpl.turnOn();

        CoffeeMachineImpl coffeeMachineImpl = new CoffeeMachineImpl();
        coffeeMachineImpl.brewCoffee();
        coffeeMachineImpl.steamMilk();
        coffeeMachineImpl.clean();

        GPSDeviceImpl gPSDeviceImpl = new GPSDeviceImpl();
        gPSDeviceImpl.navigate();
        gPSDeviceImpl.recalculateRoute();
        gPSDeviceImpl.showMap();

        ElectricKettleImpl electricKettleImpl = new ElectricKettleImpl();
        electricKettleImpl.boilWater();
        electricKettleImpl.autoOff();
        electricKettleImpl.keepWarm();

        CeilingFanImpl ceilingFanImpl = new CeilingFanImpl();
        ceilingFanImpl.setSpeed();
        ceilingFanImpl.reverseDirection();
        ceilingFanImpl.stop();

        SmartLockImpl smartLockImpl = new SmartLockImpl();
        smartLockImpl.lock();
        smartLockImpl.unlock();
        smartLockImpl.setPIN();

        SecurityCameraImpl securityCameraImpl = new SecurityCameraImpl();
        securityCameraImpl.record();
        securityCameraImpl.streamLive();
        securityCameraImpl.alertMotion();

        DoorBellImpl doorBellImpl = new DoorBellImpl();
        doorBellImpl.ring();
        doorBellImpl.recordVisitor();
        doorBellImpl.notifyUser();

        WaterPumpImpl waterPumpImpl = new WaterPumpImpl();
        waterPumpImpl.start();
        waterPumpImpl.stop();
        waterPumpImpl.setFlowRate();

        SprinklerImpl sprinklerImpl = new SprinklerImpl();
        sprinklerImpl.start();
        sprinklerImpl.stop();
        sprinklerImpl.schedule();

        GarageDoorImpl garageDoorImpl = new GarageDoorImpl();
        garageDoorImpl.open();
        garageDoorImpl.close();
        garageDoorImpl.lock();

        WIFIExtenderImpl wIFIExtenderImpl = new WIFIExtenderImpl();
        wIFIExtenderImpl.boostSignal();
        wIFIExtenderImpl.connectDevice();
        wIFIExtenderImpl.restart();

        WindowBlindImpl windowBlindImpl = new WindowBlindImpl();
        windowBlindImpl.open();
        windowBlindImpl.close();
        windowBlindImpl.adjustTilt();

        SoundBarImpl soundBarImpl = new SoundBarImpl();
        soundBarImpl.turnOn();
        soundBarImpl.adjustVolume();
        soundBarImpl.connectBluetooth();

        TreadmillImpl treadmillImpl = new TreadmillImpl();
        treadmillImpl.start();
        treadmillImpl.stop();
        treadmillImpl.adjustIncline();

        SmartMirrorImpl smartMirrorImpl = new SmartMirrorImpl();
        smartMirrorImpl.displayWeather();
        smartMirrorImpl.showTime();
        smartMirrorImpl.adjustBrightness();

        DoorSensorImpl doorSensorImpl = new DoorSensorImpl();
        doorSensorImpl.detectOpen();
        doorSensorImpl.detectClose();
        doorSensorImpl.sendAlert();

        FitnessTrackerImpl fitnessTrackerImpl = new FitnessTrackerImpl();
        fitnessTrackerImpl.countSteps();
        fitnessTrackerImpl.trackSleep();
        fitnessTrackerImpl.monitorHeartRate();

        JuicerImpl juicerImpl = new JuicerImpl();
        juicerImpl.juiceFruit();
        juicerImpl.stop();
        juicerImpl.clean();

        MixerImpl mixerImpl = new MixerImpl();
        mixerImpl.mix();
        mixerImpl.grind();
        mixerImpl.stop();

        HairDryerImpl hairDryerImpl = new HairDryerImpl();
        hairDryerImpl.turnOn();
        hairDryerImpl.adjustHeat();
        hairDryerImpl.coolShot();

        TVRemoteImpl tVRemoteImpl = new TVRemoteImpl();
        tVRemoteImpl.changeChannel();
        tVRemoteImpl.increaseVolume();
        tVRemoteImpl.mute();

        BluetoothHeadsetImpl bluetoothHeadsetImpl = new BluetoothHeadsetImpl();
        bluetoothHeadsetImpl.connect();
        bluetoothHeadsetImpl.playMusic();
        bluetoothHeadsetImpl.answerCall();

        KeyboardImpl keyboardImpl = new KeyboardImpl();
        keyboardImpl.type();
        keyboardImpl.connect();
        keyboardImpl.lightOn();

        MouseImpl mouseImpl = new MouseImpl();
        mouseImpl.click();
        mouseImpl.scroll();
        mouseImpl.connect();

        MonitorImpl monitorImpl = new MonitorImpl();
        monitorImpl.displayImage();
        monitorImpl.adjustBrightness();
        monitorImpl.turnOff();

        LampImpl lampImpl = new LampImpl();
        lampImpl.turnOn();
        lampImpl.dim();
        lampImpl.changeColor();

        SwitchImpl switchImpl = new SwitchImpl();
        switchImpl.flipOn();
        switchImpl.flipOff();
        switchImpl.status();

        ElectricStoveImpl electricStoveImpl = new ElectricStoveImpl();
        electricStoveImpl.turnOn();
        electricStoveImpl.adjustHeat();
        electricStoveImpl.turnOff();

        SmartFridgeImpl smartFridgeImpl = new SmartFridgeImpl();
        smartFridgeImpl.trackItems();
        smartFridgeImpl.cool();
        smartFridgeImpl.notify();

        CarKeyImpl carKeyImpl = new CarKeyImpl();
        carKeyImpl.lock();
        carKeyImpl.unlock();
        carKeyImpl.panicAlarm();

        ThermometerImpl thermometerImpl = new ThermometerImpl();
        thermometerImpl.measureTemp();
        thermometerImpl.reset();
        thermometerImpl.calibrate();

        MeasuringScaleImpl measuringScaleImpl = new MeasuringScaleImpl();
        measuringScaleImpl.weigh();
        measuringScaleImpl.tare();
        measuringScaleImpl.reset();

        FireAlarmImpl fireAlarmImpl = new FireAlarmImpl();
        fireAlarmImpl.detectSmoke();
        fireAlarmImpl.soundAlarm();
        fireAlarmImpl.reset();

        IntercomImpl intercomImpl = new IntercomImpl();
        intercomImpl.call();
        intercomImpl.receiveCall();
        intercomImpl.endCall();

        BatteryImpl batteryImpl = new BatteryImpl();
        batteryImpl.charge();
        batteryImpl.discharge();
        batteryImpl.checkLevel();

        FlashlightImpl flashlightImpl = new FlashlightImpl();
        flashlightImpl.turnOn();
        flashlightImpl.adjustBeam();
        flashlightImpl.blink();

        SmartPlugImpl smartPlugImpl = new SmartPlugImpl();
        smartPlugImpl.turnOn();
        smartPlugImpl.turnOff();
        smartPlugImpl.schedule();

        InverterImpl inverterImpl = new InverterImpl();
        inverterImpl.supplyPower();
        inverterImpl.chargeBattery();
        inverterImpl.switchMode();

        PowerBankImpl powerBankImpl = new PowerBankImpl();
        powerBankImpl.chargeDevice();
        powerBankImpl.recharge();
        powerBankImpl.checkStatus();

        BarcodeScannerImpl barcodeScannerImpl = new BarcodeScannerImpl();
        barcodeScannerImpl.scan();
        barcodeScannerImpl.beep();
        barcodeScannerImpl.connect();

    }
}