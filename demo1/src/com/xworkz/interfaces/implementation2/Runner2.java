package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.*;

public class Runner2 {

        public static void main(String[] args) {

            ICar obj11 = new Engine();
            IFan obj12 = new Engine();
            System.out.println("Car has Engine");
            obj11.startEngine();
            obj11.stopEngine();
            obj11.honk();
            obj12.switchOn();
            obj12.switchOff();
            obj12.rotate();
            System.out.println("------------------");

            IFan obj21 = new Dogs();
            IPhone obj22 = new Dogs();
            System.out.println("Dogssss");
            obj21.switchOn();
            obj21.switchOff();
            obj21.rotate();
            obj22.makeCall();
            obj22.receiveCall();
            obj22.charge();
            System.out.println("------------------");

            IPhone obj31 = new Cat();
            ILaptop obj32 = new Cat();
            System.out.println("Iphone captures Cat");
            obj31.makeCall();
            obj31.receiveCall();
            obj31.charge();
            obj32.powerOn();
            obj32.powerOff();
            obj32.runProgram();
            System.out.println("------------------");

            ILaptop obj41 = new Laptp();
            IChair obj42 = new Laptp();
            System.out.println("laptop with Chair");
            obj41.powerOn();
            obj41.powerOff();
            obj41.runProgram();
            obj42.sit();
            obj42.adjustHeight();
            obj42.rotate();
            System.out.println("------------------");

            IChair obj51 = new WashingMachine();
            ITelevision obj52 = new WashingMachine();
            System.out.println("WashingMachine and television");
            obj51.sit();
            obj51.adjustHeight();
            obj51.rotate();
            obj52.powerOn();
            obj52.powerOff();
            obj52.changeChannel();
            System.out.println("------------------");

            ITelevision obj61 = new Bulb();
            ILight obj62 = new Bulb();
            System.out.println("Bulb gives light");
            obj61.powerOn();
            obj61.powerOff();
            obj61.changeChannel();
            obj62.switchOn();
            obj62.switchOff();
            obj62.dim();
            System.out.println("------------------");

            ILight obj71 = new Canon();
            ICamera obj72 = new Canon();
            System.out.println("canon camera is best");
            obj71.switchOn();
            obj71.switchOff();
            obj71.dim();
            obj72.clickPhoto();
            obj72.recordVideo();
            obj72.zoom();
            System.out.println("------------------");

            ICamera obj81 = new Speaker();
            IPrinter obj82 = new Speaker();
            System.out.println("Speaker.");
            obj81.clickPhoto();
            obj81.recordVideo();
            obj81.zoom();
            obj82.print();
            obj82.scan();
            obj82.copy();
            System.out.println("------------------");

            IPrinter obj91 = new Print();
            ISpeaker obj92 = new Print();
            System.out.println("printer prints ");
            obj91.print();
            obj91.scan();
            obj91.copy();
            obj92.playMusic();
            obj92.pause();
            obj92.increaseVolume();
            System.out.println("------------------");

            ISpeaker obj101 = new AC();
            IAirConditioner obj102 = new AC();
            System.out.println("AC has be modified");
            obj101.playMusic();
            obj101.pause();
            obj101.increaseVolume();
            obj102.turnOn();
            obj102.turnOff();
            obj102.setTemperature();
            System.out.println("------------------");

            IAirConditioner obj111 = new Stove();
            IMicrowave obj112 = new Stove();
            System.out.println("stove...");
            obj111.turnOn();
            obj111.turnOff();
            obj111.setTemperature();
            obj112.start();
            obj112.stop();
            obj112.setTimer();
            System.out.println("------------------");

            IMicrowave obj121 = new Light();
            IRefrigerator obj122 = new Light();
            System.out.println("microwave and refrigerator has light");
            obj121.start();
            obj121.stop();
            obj121.setTimer();
            obj122.cool();
            obj122.freeze();
            obj122.defrost();
            System.out.println("------------------");

            IRefrigerator obj131 = new Refrige();
            IWashingMachine obj132 = new Refrige();
            System.out.println("Refrigeeeeee");
            obj131.cool();
            obj131.freeze();
            obj131.defrost();
            obj132.wash();
            obj132.rinse();
            obj132.spin();
            System.out.println("------------------");

            IWashingMachine obj141 = new LightHouse();
            IOven obj142 = new LightHouse();
            System.out.println("Ligthhouseee has oven ");
            obj141.wash();
            obj141.rinse();
            obj141.spin();
            obj142.preheat();
            obj142.bake();
            obj142.grill();
            System.out.println("------------------");

            IOven obj151 = new House();
            IToaster obj152 = new House();
            System.out.println("house has oven:");
            obj151.preheat();
            obj151.bake();
            obj151.grill();
            obj152.insertBread();
            obj152.toast();
            obj152.eject();
            System.out.println("------------------");

            IToaster obj161 = new Bread();
            IClock obj162 = new Bread();
            System.out.println("bread toaster");
            obj161.insertBread();
            obj161.toast();
            obj161.eject();
            obj162.showTime();
            obj162.setAlarm();
            obj162.stopAlarm();
            System.out.println("------------------");

            IClock obj171 = new Time();
            IWatch obj172 = new Time();
            System.out.println("time can be seen in clock,watch or phone");
            obj171.showTime();
            obj171.setAlarm();
            obj171.stopAlarm();
            obj172.showTime();
            obj172.startTimer();
            obj172.stopTimer();
            System.out.println("------------------");

            IWatch obj181 = new Watch();
            IBlender obj182 = new Watch();
            System.out.println("Showing time");
            obj181.showTime();
            obj181.startTimer();
            obj181.stopTimer();
            obj182.blend();
            obj182.pulse();
            obj182.clean();
            System.out.println("------------------");

            IBlender obj191 = new Cattel();
            IHeater obj192 = new Cattel();
            System.out.println("Cattel can heat very quickly");
            obj191.blend();
            obj191.pulse();
            obj191.clean();
            obj192.turnOn();
            obj192.turnOff();
            obj192.setTemperature();
            System.out.println("------------------");

            IHeater obj201 = new Vision();
            IProjector obj202 = new Vision();
            System.out.println("Vision of the Heater and Projector");
            obj201.turnOn();
            obj201.turnOff();
            obj201.setTemperature();
            obj202.projectImage();
            obj202.adjustFocus();
            obj202.shutDown();
            System.out.println("------------------");

            IProjector obj211 = new Focus();
            IDrone obj212 = new Focus();
            System.out.println("Focusing the projector");
            obj211.projectImage();
            obj211.adjustFocus();
            obj211.shutDown();
            obj212.takeOff();
            obj212.land();
            obj212.fly();
            System.out.println("------------------");

            IDrone obj221 = new Machine();
            IRobot obj222 = new Machine();
            System.out.println("Drone for the viewing robot");
            obj221.takeOff();
            obj221.land();
            obj221.fly();
            obj222.walk();
            obj222.speak();
            obj222.grabObject();
            System.out.println("------------------");

            IRobot obj231 = new Cleaner();
            IVacuumCleaner obj232 = new Cleaner();
            System.out.println("VacuumCleaner cleans the dust very fastly");
            obj231.walk();
            obj231.speak();
            obj231.grabObject();
            obj232.start();
            obj232.stop();
            obj232.changeMode();
            System.out.println("------------------");

            IVacuumCleaner obj241 = new BroomStick();
            IRouter obj242 = new BroomStick();
            System.out.println("Broomstick cleans the dust");
            obj241.start();
            obj241.stop();
            obj241.changeMode();
            obj242.connect();
            obj242.disconnect();
            obj242.reset();
            System.out.println("------------------");

            IRouter obj251 = new App();
            ITablet obj252 = new App();
            System.out.println("App can be created in tablet");
            obj251.connect();
            obj251.disconnect();
            obj251.reset();
            obj252.tap();
            obj252.swipe();
            obj252.installApp();
            System.out.println("------------------");

        }
    }



