import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;
public class Monitor {
    private String brand;
    private int resolutionWidth;
    private int resolutionHeight;
    private double diagonalSize;
    private boolean powerStatus;
    private ColorProfile colorProfile;
    private BrightnessControl brightnessControl;

    // Конструктор за замовчуванням
    public Monitor() {
        this.brand = "Unknown";
        this.resolutionWidth = 1920;
        this.resolutionHeight = 720;
        this.diagonalSize = 24;
        this.powerStatus = false;
        this.colorProfile = new ColorProfile();
        this.brightnessControl = new BrightnessControl();
    }

    // Конструктор з параметрами
    public Monitor(String brand, int resolutionWidth, int resolutionHeight, double diagonalSize,
                   ColorProfile colorProfile, BrightnessControl brightnessControl) {
        this.brand = brand;
        this.resolutionWidth = resolutionWidth;
        this.resolutionHeight = resolutionHeight;
        this.diagonalSize = diagonalSize;
        this.powerStatus = false;
        this.colorProfile = colorProfile;
        this.brightnessControl = brightnessControl;
    }

    // Метод для введення параметрів монітора
    public void inputMonitorParameters() {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть бренд монітора: ");
        this.brand = input.nextLine();

        System.out.println("Введіть ширину роздільної здатності: ");
        this.resolutionWidth = input.nextInt();

        System.out.println("Введіть висоту роздільної здатності: ");
        this.resolutionHeight = input.nextInt();

        System.out.println("Введіть діагональ розміру: ");
        this.diagonalSize = input.nextDouble();
    }

    // Метод для ввімкнення монітора
    public String powerOn() {
        System.out.println("Монітор " + brand + " увімкнено.");
        powerStatus = true;
        return brand;
    }

    // Метод для вимкнення монітора
    public void powerOff() {
        System.out.println("Монітор вимкнено.");
        powerStatus = false;
    }

    // Метод для отримання інформації про роздільну здатність монітора
    public String getResolutionInfo() {
        return "Роздільність: " + resolutionWidth + "x" + resolutionHeight;
    }

    // Метод для отримання інформації про діагональ розміру монітора
    public String getDiagonalSizeInfo() {
        return "Діагональ: " + diagonalSize + " дюймів";
    }

    // Метод для виведення інформації про монітор, якщо його увімкнено
    public void printMonitorInfo() {
        if (powerStatus) {
            System.out.println("Інформація про монітор:");
            System.out.println("Бренд: " + brand);
            System.out.println("Роздільність: " + resolutionWidth + "x" + resolutionHeight);
            System.out.println("Діагональ: " + diagonalSize + " дюймів");
            System.out.println(colorProfile.getProfileInfo());
            System.out.println(brightnessControl.getBrightnessInfo());
        } else {
            System.out.println("Монітор вимкнено. Інформація не доступна.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (powerStatus) {
            sb.append("Інформація про монітор:\n");
            sb.append("Бренд: ").append(brand).append("\n");
            sb.append("Роздільність: ").append(resolutionWidth).append("x").append(resolutionHeight).append("\n");
            sb.append("Діагональ: ").append(diagonalSize).append(" дюймів\n");
            sb.append(colorProfile.getProfileInfo()).append("\n");
            sb.append(brightnessControl.getBrightnessInfo()).append("\n");
        } else {
            sb.append("Монітор вимкнено. Інформація не доступна.\n");
        }

        // Запис інформації у файл
        try {
            FileWriter writer = new FileWriter("monitor_info.txt");
            writer.write(sb.toString());
            writer.close();
            System.out.println("Інформацію про монітор збережено у файл monitor_info.txt");
        } catch (IOException e) {
            System.out.println("Помилка при записі у файл: " + e.getMessage());
        }
        return sb.toString();
    }
}