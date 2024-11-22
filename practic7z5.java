import java.util.Random;
import java.util.Scanner;

public class practic7z5 {
    //Ракітенко Артем Кн-21
    //Завдання 5

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Введення розміру матриці
        System.out.print("Введіть розмір матриці: ");
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

        // Транспонування
        int[][] transposedMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Виведення транспонованої матриці
        System.out.println("Транспонована матриця:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
