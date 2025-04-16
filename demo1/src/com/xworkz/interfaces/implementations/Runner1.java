package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

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

        DualImpl1 dualImpl1 = new DualImpl1();
        dualImpl1.startEngine();
        dualImpl1.stopEngine();
        dualImpl1.honk();

        DualImpl2 dualImpl2 = new DualImpl2();
        dualImpl2.switchOn();
        dualImpl2.switchOff();
        dualImpl2.rotate();

        DualImpl3 dualImpl3 = new DualImpl3();
        dualImpl3.makeCall();
        dualImpl3.receiveCall();
        dualImpl3.charge();

        DualImpl4 dualImpl4 = new DualImpl4();
        dualImpl4.powerOn();
        dualImpl4.powerOff();
        dualImpl4.runProgram();

        DualImpl5 dualImpl5 = new DualImpl5();
        dualImpl5.sit();
        dualImpl5.adjustHeight();
        dualImpl5.rotate();

        DualImpl6 dualImpl6 = new DualImpl6();
        dualImpl6.powerOn();
        dualImpl6.powerOff();
        dualImpl6.changeChannel();

        DualImpl7 dualImpl7 = new DualImpl7();
        dualImpl7.switchOn();
        dualImpl7.switchOff();
        dualImpl7.dim();

        DualImpl8 dualImpl8 = new DualImpl8();
        dualImpl8.clickPhoto();
        dualImpl8.recordVideo();
        dualImpl8.zoom();

        DualImpl9 dualImpl9 = new DualImpl9();
        dualImpl9.print();
        dualImpl9.scan();
        dualImpl9.copy();

        DualImpl10 dualImpl10 = new DualImpl10();
        dualImpl10.playMusic();
        dualImpl10.pause();
        dualImpl10.increaseVolume();

        DualImpl11 dualImpl11 = new DualImpl11();
        dualImpl11.turnOn();
        dualImpl11.turnOff();
        dualImpl11.setTemperature();

        DualImpl12 dualImpl12 = new DualImpl12();
        dualImpl12.start();
        dualImpl12.stop();
        dualImpl12.setTimer();

        DualImpl13 dualImpl13 = new DualImpl13();
        dualImpl13.cool();
        dualImpl13.freeze();
        dualImpl13.defrost();

        DualImpl14 dualImpl14 = new DualImpl14();
        dualImpl14.wash();
        dualImpl14.rinse();
        dualImpl14.spin();

        DualImpl15 dualImpl15 = new DualImpl15();
        dualImpl15.preheat();
        dualImpl15.bake();
        dualImpl15.grill();

        DualImpl16 dualImpl16 = new DualImpl16();
        dualImpl16.insertBread();
        dualImpl16.toast();
        dualImpl16.eject();

        DualImpl17 dualImpl17 = new DualImpl17();
        dualImpl17.showTime();
        dualImpl17.setAlarm();
        dualImpl17.stopAlarm();

        DualImpl18 dualImpl18 = new DualImpl18();
        dualImpl18.showTime();
        dualImpl18.startTimer();
        dualImpl18.stopTimer();

        DualImpl19 dualImpl19 = new DualImpl19();
        dualImpl19.blend();
        dualImpl19.pulse();
        dualImpl19.clean();

        DualImpl20 dualImpl20 = new DualImpl20();
        dualImpl20.turnOn();
        dualImpl20.turnOff();
        dualImpl20.setTemperature();

        DualImpl21 dualImpl21 = new DualImpl21();
        dualImpl21.projectImage();
        dualImpl21.adjustFocus();
        dualImpl21.shutDown();

        DualImpl22 dualImpl22 = new DualImpl22();
        dualImpl22.takeOff();
        dualImpl22.land();
        dualImpl22.fly();

        DualImpl23 dualImpl23 = new DualImpl23();
        dualImpl23.walk();
        dualImpl23.speak();
        dualImpl23.grabObject();

        DualImpl24 dualImpl24 = new DualImpl24();
        dualImpl24.start();
        dualImpl24.stop();
        dualImpl24.changeMode();

        DualImpl25 dualImpl25 = new DualImpl25();
        dualImpl25.connect();
        dualImpl25.disconnect();
        dualImpl25.reset();

        MultiImpl1 multiImpl1 = new MultiImpl1();
        multiImpl1.startEngine();
        multiImpl1.stopEngine();
        multiImpl1.honk();

        MultiImpl2 multiImpl2 = new MultiImpl2();
        multiImpl2.switchOn();
        multiImpl2.switchOff();
        multiImpl2.rotate();

        MultiImpl3 multiImpl3 = new MultiImpl3();
        multiImpl3.makeCall();
        multiImpl3.receiveCall();
        multiImpl3.charge();

        MultiImpl4 multiImpl4 = new MultiImpl4();
        multiImpl4.powerOn();
        multiImpl4.powerOff();
        multiImpl4.runProgram();

        MultiImpl5 multiImpl5 = new MultiImpl5();
        multiImpl5.sit();
        multiImpl5.adjustHeight();
        multiImpl5.rotate();

        MultiImpl6 multiImpl6 = new MultiImpl6();
        multiImpl6.powerOn();
        multiImpl6.powerOff();
        multiImpl6.changeChannel();

        MultiImpl7 multiImpl7 = new MultiImpl7();
        multiImpl7.switchOn();
        multiImpl7.switchOff();
        multiImpl7.dim();

        MultiImpl8 multiImpl8 = new MultiImpl8();
        multiImpl8.clickPhoto();
        multiImpl8.recordVideo();
        multiImpl8.zoom();

        MultiImpl9 multiImpl9 = new MultiImpl9();
        multiImpl9.print();
        multiImpl9.scan();
        multiImpl9.copy();

        MultiImpl10 multiImpl10 = new MultiImpl10();
        multiImpl10.playMusic();
        multiImpl10.pause();
        multiImpl10.increaseVolume();

        MultiImpl11 multiImpl11 = new MultiImpl11();
        multiImpl11.turnOn();
        multiImpl11.turnOff();
        multiImpl11.setTemperature();

        MultiImpl12 multiImpl12 = new MultiImpl12();
        multiImpl12.start();
        multiImpl12.stop();
        multiImpl12.setTimer();

        MultiImpl13 multiImpl13 = new MultiImpl13();
        multiImpl13.cool();
        multiImpl13.freeze();
        multiImpl13.defrost();

        MultiImpl14 multiImpl14 = new MultiImpl14();
        multiImpl14.wash();
        multiImpl14.rinse();
        multiImpl14.spin();

        MultiImpl15 multiImpl15 = new MultiImpl15();
        multiImpl15.preheat();
        multiImpl15.bake();
        multiImpl15.grill();

        MultiImpl16 multiImpl16 = new MultiImpl16();
        multiImpl16.insertBread();
        multiImpl16.toast();
        multiImpl16.eject();

        MultiImpl17 multiImpl17 = new MultiImpl17();
        multiImpl17.showTime();
        multiImpl17.setAlarm();
        multiImpl17.stopAlarm();

        MultiImpl18 multiImpl18 = new MultiImpl18();
        multiImpl18.showTime();
        multiImpl18.startTimer();
        multiImpl18.stopTimer();

        MultiImpl19 multiImpl19 = new MultiImpl19();
        multiImpl19.blend();
        multiImpl19.pulse();
        multiImpl19.clean();

        MultiImpl20 multiImpl20 = new MultiImpl20();
        multiImpl20.turnOn();
        multiImpl20.turnOff();
        multiImpl20.setTemperature();

        MultiImpl21 multiImpl21 = new MultiImpl21();
        multiImpl21.projectImage();
        multiImpl21.adjustFocus();
        multiImpl21.shutDown();

        MultiImpl22 multiImpl22 = new MultiImpl22();
        multiImpl22.takeOff();
        multiImpl22.land();
        multiImpl22.fly();

        MultiImpl23 multiImpl23 = new MultiImpl23();
        multiImpl23.walk();
        multiImpl23.speak();
        multiImpl23.grabObject();

        MultiImpl24 multiImpl24 = new MultiImpl24();
        multiImpl24.start();
        multiImpl24.stop();
        multiImpl24.changeMode();

        MultiImpl25 multiImpl25 = new MultiImpl25();
        multiImpl25.connect();
        multiImpl25.disconnect();
        multiImpl25.reset();

    }
}