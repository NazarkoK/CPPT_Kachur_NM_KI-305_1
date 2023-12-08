import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.System.out;
/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 * @version 1.0
 */
public class EquationsApp {
    public static void main(String[] args) {
        try {
            out.print("Введіть назву файлу, куди зберегти результат: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try {
                Equations eq = new Equations();
                out.print("Введіть X в градусах: ");
                int x = in.nextInt();
                double result = eq.calculate(x);
                String expression = "ctg(" + x + "°)/tg(" + x + "°)";
                fout.println("Вираз: " + expression);
                fout.println("Результат: " + result);
                out.println("Вираз: " + expression);
                out.println("Результат: " + result);
            } finally {
                fout.flush();
                fout.close();
            }
        } catch (CalcException | FileNotFoundException ex) {
            if (ex instanceof CalcException) {
                out.print(((CalcException)ex).getMessage());
            } else {
                out.print("Можливо, неправильний шлях до файлу!");
            }
        }
    }
}
