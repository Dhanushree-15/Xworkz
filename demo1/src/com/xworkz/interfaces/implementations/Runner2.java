package com.xworkz.interfaces.implementations;
import com.xworkz.interfaces.interfaces.*;

public class Runner2 {

        public static void main(String[] args) {

            ICar obj11 = new DualImpl1();
            IFan obj12 = new DualImpl1();
            System.out.println("DualImpl1:");
            obj11.startEngine();
            obj11.stopEngine();
            obj11.honk();
            obj12.switchOn();
            obj12.switchOff();
            obj12.rotate();
            System.out.println("------------------");

            IFan obj21 = new DualImpl2();
            IPhone obj22 = new DualImpl2();
            System.out.println("DualImpl2:");
            obj21.switchOn();
            obj21.switchOff();
            obj21.rotate();
            obj22.makeCall();
            obj22.receiveCall();
            obj22.charge();
            System.out.println("------------------");

            IPhone obj31 = new DualImpl3();
            ILaptop obj32 = new DualImpl3();
            System.out.println("DualImpl3:");
            obj31.makeCall();
            obj31.receiveCall();
            obj31.charge();
            obj32.powerOn();
            obj32.powerOff();
            obj32.runProgram();
            System.out.println("------------------");

            ILaptop obj41 = new DualImpl4();
            IChair obj42 = new DualImpl4();
            System.out.println("DualImpl4:");
            obj41.powerOn();
            obj41.powerOff();
            obj41.runProgram();
            obj42.sit();
            obj42.adjustHeight();
            obj42.rotate();
            System.out.println("------------------");

            IChair obj51 = new DualImpl5();
            ITelevision obj52 = new DualImpl5();
            System.out.println("DualImpl5:");
            obj51.sit();
            obj51.adjustHeight();
            obj51.rotate();
            obj52.powerOn();
            obj52.powerOff();
            obj52.changeChannel();
            System.out.println("------------------");

            ITelevision obj61 = new DualImpl6();
            ILight obj62 = new DualImpl6();
            System.out.println("DualImpl6:");
            obj61.powerOn();
            obj61.powerOff();
            obj61.changeChannel();
            obj62.switchOn();
            obj62.switchOff();
            obj62.dim();
            System.out.println("------------------");

            ILight obj71 = new DualImpl7();
            ICamera obj72 = new DualImpl7();
            System.out.println("DualImpl7:");
            obj71.switchOn();
            obj71.switchOff();
            obj71.dim();
            obj72.clickPhoto();
            obj72.recordVideo();
            obj72.zoom();
            System.out.println("------------------");

            ICamera obj81 = new DualImpl8();
            IPrinter obj82 = new DualImpl8();
            System.out.println("DualImpl8:");
            obj81.clickPhoto();
            obj81.recordVideo();
            obj81.zoom();
            obj82.print();
            obj82.scan();
            obj82.copy();
            System.out.println("------------------");

            IPrinter obj91 = new DualImpl9();
            ISpeaker obj92 = new DualImpl9();
            System.out.println("DualImpl9:");
            obj91.print();
            obj91.scan();
            obj91.copy();
            obj92.playMusic();
            obj92.pause();
            obj92.increaseVolume();
            System.out.println("------------------");

            ISpeaker obj101 = new DualImpl10();
            IAirConditioner obj102 = new DualImpl10();
            System.out.println("DualImpl10:");
            obj101.playMusic();
            obj101.pause();
            obj101.increaseVolume();
            obj102.turnOn();
            obj102.turnOff();
            obj102.setTemperature();
            System.out.println("------------------");

            IAirConditioner obj111 = new DualImpl11();
            IMicrowave obj112 = new DualImpl11();
            System.out.println("DualImpl11:");
            obj111.turnOn();
            obj111.turnOff();
            obj111.setTemperature();
            obj112.start();
            obj112.stop();
            obj112.setTimer();
            System.out.println("------------------");

            IMicrowave obj121 = new DualImpl12();
            IRefrigerator obj122 = new DualImpl12();
            System.out.println("DualImpl12:");
            obj121.start();
            obj121.stop();
            obj121.setTimer();
            obj122.cool();
            obj122.freeze();
            obj122.defrost();
            System.out.println("------------------");

            IRefrigerator obj131 = new DualImpl13();
            IWashingMachine obj132 = new DualImpl13();
            System.out.println("DualImpl13:");
            obj131.cool();
            obj131.freeze();
            obj131.defrost();
            obj132.wash();
            obj132.rinse();
            obj132.spin();
            System.out.println("------------------");

            IWashingMachine obj141 = new DualImpl14();
            IOven obj142 = new DualImpl14();
            System.out.println("DualImpl14:");
            obj141.wash();
            obj141.rinse();
            obj141.spin();
            obj142.preheat();
            obj142.bake();
            obj142.grill();
            System.out.println("------------------");

            IOven obj151 = new DualImpl15();
            IToaster obj152 = new DualImpl15();
            System.out.println("DualImpl15:");
            obj151.preheat();
            obj151.bake();
            obj151.grill();
            obj152.insertBread();
            obj152.toast();
            obj152.eject();
            System.out.println("------------------");

            IToaster obj161 = new DualImpl16();
            IClock obj162 = new DualImpl16();
            System.out.println("DualImpl16:");
            obj161.insertBread();
            obj161.toast();
            obj161.eject();
            obj162.showTime();
            obj162.setAlarm();
            obj162.stopAlarm();
            System.out.println("------------------");

            IClock obj171 = new DualImpl17();
            IWatch obj172 = new DualImpl17();
            System.out.println("DualImpl17:");
            obj171.showTime();
            obj171.setAlarm();
            obj171.stopAlarm();
            obj172.showTime();
            obj172.startTimer();
            obj172.stopTimer();
            System.out.println("------------------");

            IWatch obj181 = new DualImpl18();
            IBlender obj182 = new DualImpl18();
            System.out.println("DualImpl18:");
            obj181.showTime();
            obj181.startTimer();
            obj181.stopTimer();
            obj182.blend();
            obj182.pulse();
            obj182.clean();
            System.out.println("------------------");

            IBlender obj191 = new DualImpl19();
            IHeater obj192 = new DualImpl19();
            System.out.println("DualImpl19:");
            obj191.blend();
            obj191.pulse();
            obj191.clean();
            obj192.turnOn();
            obj192.turnOff();
            obj192.setTemperature();
            System.out.println("------------------");

            IHeater obj201 = new DualImpl20();
            IProjector obj202 = new DualImpl20();
            System.out.println("DualImpl20:");
            obj201.turnOn();
            obj201.turnOff();
            obj201.setTemperature();
            obj202.projectImage();
            obj202.adjustFocus();
            obj202.shutDown();
            System.out.println("------------------");

            IProjector obj211 = new DualImpl21();
            IDrone obj212 = new DualImpl21();
            System.out.println("DualImpl21:");
            obj211.projectImage();
            obj211.adjustFocus();
            obj211.shutDown();
            obj212.takeOff();
            obj212.land();
            obj212.fly();
            System.out.println("------------------");

            IDrone obj221 = new DualImpl22();
            IRobot obj222 = new DualImpl22();
            System.out.println("DualImpl22:");
            obj221.takeOff();
            obj221.land();
            obj221.fly();
            obj222.walk();
            obj222.speak();
            obj222.grabObject();
            System.out.println("------------------");

            IRobot obj231 = new DualImpl23();
            IVacuumCleaner obj232 = new DualImpl23();
            System.out.println("DualImpl23:");
            obj231.walk();
            obj231.speak();
            obj231.grabObject();
            obj232.start();
            obj232.stop();
            obj232.changeMode();
            System.out.println("------------------");

            IVacuumCleaner obj241 = new DualImpl24();
            IRouter obj242 = new DualImpl24();
            System.out.println("DualImpl24:");
            obj241.start();
            obj241.stop();
            obj241.changeMode();
            obj242.connect();
            obj242.disconnect();
            obj242.reset();
            System.out.println("------------------");

            IRouter obj251 = new DualImpl25();
            ITablet obj252 = new DualImpl25();
            System.out.println("DualImpl25:");
            obj251.connect();
            obj251.disconnect();
            obj251.reset();
            obj252.tap();
            obj252.swipe();
            obj252.installApp();
            System.out.println("------------------");

        }
    }

