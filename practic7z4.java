import java.util.Random;
import java.util.Scanner;

public class practic7z4 {
    //Ракітенко Артем Кн-21
    //Завдання 4

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Розмір матриці
        System.out.print("Введіть розмір матриці (? x ?): ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        // Генерація випадкових значень матриці
        System.out.println("Матриця: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(100) + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Індекси для минора
        System.out.print("Введіть індекс рядка минора (0 - " + (size - 1) + "): ");
        int rowToRemove = scanner.nextInt();
        System.out.print("Введіть індекс стовпця минора (0 - " + (size - 1) + "): ");
        int colToRemove = scanner.nextInt();

        // Обчислення минора
        int[][] minor = getMinor(matrix, rowToRemove, colToRemove);

        // Виведення минора
        System.out.println("Мінор матриці:");
        for (int i = 0; i < minor.length; i++) {
            for (int j = 0; j < minor[i].length; j++) {
                System.out.print(minor[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    // Метод для обчислення минора
    public static int[][] getMinor(int[][] matrix, int rowToRemove, int colToRemove) {
        int size = matrix.length;
        int[][] minor = new int[size - 1][size - 1];
        int minorRow = 0;

        for (int i = 0; i < size; i++) {
            if (i == rowToRemove) {
                continue;
            }
            int minorCol = 0;
            for (int j = 0; j < size; j++) {
                if (j == colToRemove) {
                    continue;
                }
                minor[minorRow][minorCol++] = matrix[i][j];
            }
            minorRow++;
        }

        return minor;
    }
}
