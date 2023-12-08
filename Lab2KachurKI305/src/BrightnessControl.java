import java.util.Scanner;

public class BrightnessControl {
    private int brightnessLevel;

    // Конструктор за замовчуванням
    public BrightnessControl() {
        this.brightnessLevel = 50;
    }

    // Конструктор з параметрами
    public BrightnessControl(int brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
    }

    // Отримання інформації про рівень яскравості
    public String getBrightnessInfo() {
        return "Рівень яскравості: " + brightnessLevel + "%";
    }

    // Регулювання яскравості
    public void adjustBrightness(int newLevel) {
        this.brightnessLevel = newLevel;
        System.out.println("Рівень яскравості було змінено.");
    }

    // Введення параметрів яскравості з клавіатури
    public void inputBrightnessParameters() {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть новий рівень яскравості: ");
        this.brightnessLevel = input.nextInt();
    }
}
