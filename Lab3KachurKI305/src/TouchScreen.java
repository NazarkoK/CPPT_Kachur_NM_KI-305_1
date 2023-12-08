import java.util.Scanner;

public class TouchScreen extends Monitor {
    private boolean touchEnabled;
    private String userInput;

    public TouchScreen() {
        super();
        this.touchEnabled = true;
        this.userInput = "";
    }

    public TouchScreen(String brand, int resolutionWidth, int resolutionHeight, double diagonalSize,
                       ColorProfile colorProfile, BrightnessControl brightnessControl, boolean touchEnabled) {
        super(brand, resolutionWidth, resolutionHeight, diagonalSize, colorProfile, brightnessControl);
        this.touchEnabled = touchEnabled;
        this.userInput = "";
    }

    public void enableTouch() {
        System.out.println("Сенсорний екран активовано.");
        touchEnabled = true;
    }

    public void performTouchFunctionality() {
        if (touchEnabled) {
            System.out.println("Використовую функціональність сенсорного екрану: дотик!");
        } else {
            System.out.println("Сенсорний екран не активований.");
        }
    }

    public void drawOnScreen() {
        if (touchEnabled) {
            System.out.println("Використовую функціональність сенсорного екрану: малюю на екрані!");
            // Додаємо можливість вводу тексту з консолі
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть текст для відображення на екрані: ");
            userInput = scanner.nextLine();
        } else {
            System.out.println("Сенсорний екран не активований. Неможливо малювати.");
        }
    }

    @Override
    public void touchScreenFunctionality() {
        if (touchEnabled) {
            System.out.println("Цей монітор має сенсорний екран.");
        } else {
            System.out.println("Сенсорний екран не активований.");
        }
    }

    @Override
    public void printMonitorInfo() {
        super.printMonitorInfo();
        touchScreenFunctionality();
        System.out.println("Введений текст на екрані: " + userInput);
    }
}
