import java.util.Random;

public class practic7z2 {
    //Ракітенко Артем Кн-21
    //Завдання 2

    public static void main(String[] args) {
        int rows = 21;
        int cols = 21;
        double[][] array = new double[rows][cols];
        Random random = new Random();

        // Генерація випадкового масиву з плаваючою крапкою
        System.out.println("Початковий масив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = 1 + (99 * random.nextDouble());
                System.out.printf("%.2f ", array[i][j]);
            }
            System.out.println();
        }

        // Заміна елементів з непарним індексом на квадратний корінь
        System.out.println("\nМасив після заміни елементів:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 != 0 || j % 2 != 0) {
                    array[i][j] = Math.sqrt(array[i][j]);
                }
                System.out.printf("%.2f ", array[i][j]);
            }
            System.out.println();
        }
    }
}
