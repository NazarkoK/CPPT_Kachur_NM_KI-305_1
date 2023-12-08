public class MonitorDriver {
    public static void main(String[] args) {
        // Створення об'єкта класу TouchScreen
        TouchScreen myMonitor = new TouchScreen();
        myMonitor.inputMonitorParameters();  // Введення параметрів
        myMonitor.touchScreenFunctionality();  // Вивід інформації про сенсорний екран

        myMonitor.performTouchFunctionality();  // Малюємо на сенсорному екрані
        myMonitor.printMonitorInfo();  // Виводимо інформацію про монітор
        myMonitor.powerOff();  // Вимкнення монітора

        ColorProfile colorProfile2 = new ColorProfile("Pro");
        BrightnessControl brightnessControl2 = new BrightnessControl();
        TouchScreen secondMonitor = new TouchScreen("Dell", 1920, 1080, 27, colorProfile2, brightnessControl2, true);
        colorProfile2.inputProfileParameters();
        brightnessControl2.inputBrightnessParameters();
        System.out.println(colorProfile2.getProfileInfo());
        System.out.println(brightnessControl2.getBrightnessInfo());
        secondMonitor.powerOn();
        myMonitor.touchScreenFunctionality();  // Вивід інформації про сенсорний екран
        secondMonitor.powerOff();

        // Створення третього монітора за замовчуванням
        TouchScreen thirdMonitor = new TouchScreen();

        myMonitor.powerOn();
        myMonitor.printMonitorInfo();
        secondMonitor.powerOn();
        thirdMonitor.powerOn();
        secondMonitor.printMonitorInfo();
        thirdMonitor.printMonitorInfo();
    }
}
