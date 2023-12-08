import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Клас Lab1KachurKI305 реалізує приклад програми до лабораторної роботи №1
 *
 * @author Nazar
 * @version 1.0
 * @since version 1.0
 */


public class Lab1KachurKI305 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        char filler;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Введіть парне число рядків квадратної матриці (мінімум 4): ");
            nRows = in.nextInt();
        } while (nRows < 4 || nRows % 2 != 0);

        in.nextLine();

        // Створюємо матрицю з розмірами nRows x nRows/2
        arr = new char[nRows][nRows / 2];

        System.out.print("Введіть символ для заповнення обох квадратів: ");
        filler = in.nextLine().charAt(0);

        // Заповнюємо символом filler
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nRows / 2; j++) {
                arr[i][j] = filler;
            }
        }


        for (int i = 0; i < nRows / 2; i++) {
            for (int j = 0; j < nRows / 2; j++) {
                System.out.print("  ");
            }
            for (int j1 = 0; j1 < nRows / 2; j1++) {
                System.out.print(arr[i][j1] + " ");
            }
            System.out.println();
        }

        for (int i = nRows / 2; i < nRows; i++) {
            for (int j = 0; j < nRows / 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Запис матриці у файл "MyFile.txt"
        try {
            File dataFile = new File("MyFile.txt");
            PrintWriter fout = new PrintWriter(dataFile);

            for (int i = 0; i < nRows / 2; i++) {
                for (int j = 0; j < nRows / 2; j++) {
                    fout.print("  ");
                }
                for (int j1 = 0; j1 < nRows / 2; j1++) {
                    fout.print(arr[i][j1] + " ");
                }
                fout.println();
            }
            for (int i = nRows / 2; i < nRows; i++) {
                for (int j = 0; j < nRows / 2; j++) {
                    fout.print(arr[i][j] + " ");
                }
                fout.println();
            }

            fout.close();
        } catch (IOException e) {
            System.out.println("Помилка при записі в файл.");
        }
    }
}