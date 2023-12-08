import java.util.Scanner;

public class ColorProfile {
    private String profile;

    // Конструктор за замовчуванням
    public ColorProfile() {
        this.profile = "Standard";
    }

    // Конструктор з параметрами
    public ColorProfile(String profile) {
        this.profile = profile;
    }

    // Отримання інформації про колірний профіль
    public String getProfileInfo() {
        return "Колірний профіль: " + profile;
    }

    // Налаштування колірного профілю
    public void setProfile(String newProfile) {
        this.profile = newProfile;
        System.out.println("Колірний профіль було змінено.");
    }

    // Введення параметрів колірного профілю з клавіатури
    public void inputProfileParameters() {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть новий колірний профіль: ");
        this.profile = input.nextLine();
    }
}
