import java.util.Scanner;
public class DisplayPort {
    private boolean connected;

    // Конструктор за замовчуванням
    public DisplayPort() {
        this.connected = false;
    }

    // Підключення до DisplayPort
    public void connect() {
        System.out.println("Монітор підключено через DisplayPort.");
        connected = true;
    }

    // Відключення від DisplayPort
    public void disconnect() {
        System.out.println("Монітор відключено від DisplayPort.");
        connected = false;
    }

    // Перевірка, чи під'єднано до DisplayPort
    public boolean isConnected() {
        return connected;
    }
}
