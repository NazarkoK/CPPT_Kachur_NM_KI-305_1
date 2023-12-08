import java.util.Scanner;

public class MonitorDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Перший монітор з параметрами, введеними користувачем
        Monitor myMonitor = new Monitor();
        myMonitor.inputMonitorParameters();
        DisplayPort displayPort = new DisplayPort();
        ColorProfile colorProfile1 = new ColorProfile();
        BrightnessControl brightnessControl1 = new BrightnessControl();

        myMonitor.powerOn();
        displayPort.connect();
        System.out.println(myMonitor.getResolutionInfo());
        System.out.println(myMonitor.getDiagonalSizeInfo());
        colorProfile1.inputProfileParameters();
        brightnessControl1.inputBrightnessParameters();
        System.out.println(colorProfile1.getProfileInfo());
        System.out.println(brightnessControl1.getBrightnessInfo());
        myMonitor.powerOff();
        displayPort.disconnect();

        // Другий монітор з параметрами за замовчуванням
        ColorProfile colorProfile2 = new ColorProfile("Pro");
        BrightnessControl brightnessControl2 = new BrightnessControl();
        Monitor secondMonitor = new Monitor("Dell", 1920, 1080, 27, colorProfile2, brightnessControl2);

        secondMonitor.powerOn();
        System.out.println(secondMonitor.getResolutionInfo());
        System.out.println(secondMonitor.getDiagonalSizeInfo());
        System.out.println(colorProfile2.getProfileInfo());
        System.out.println(brightnessControl2.getBrightnessInfo());
        // Введення нової яскравості для другого монітора
        brightnessControl2.inputBrightnessParameters();
        System.out.println(brightnessControl2.getBrightnessInfo());
        secondMonitor.powerOff();

        // Третій монітор, який приймає параметри в дужках
        ColorProfile colorProfile3 = new ColorProfile();
        BrightnessControl brightnessControl3 = new BrightnessControl();
        Monitor thirdMonitor = new Monitor();

        thirdMonitor.powerOn();
        System.out.println(thirdMonitor.getResolutionInfo());
        System.out.println(thirdMonitor.getDiagonalSizeInfo());
        System.out.println(colorProfile3.getProfileInfo());
        System.out.println(brightnessControl3.getBrightnessInfo());
        thirdMonitor.powerOff();

        // Виведення інформації для всіх увімкнених моніторів
        myMonitor.printMonitorInfo();
        myMonitor.powerOn();
        myMonitor.printMonitorInfo();
        secondMonitor.powerOn();
        thirdMonitor.powerOn();
        secondMonitor.printMonitorInfo();
        thirdMonitor.printMonitorInfo();
    }
}
