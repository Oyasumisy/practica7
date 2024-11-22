public class practic7z1 {
    //Ракітенко Артем Кн-21
    //Завдання 1

    public static void main(String[] args) {
        int rows = 21;
        int[][] pyramid = new int[rows][];

        // Створення зубчастого пірамідального масиву
        for (int i = 0; i < rows; i++) {
            pyramid[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] = j + 1;
            }
        }

        // Виведення масиву у звичайному
        System.out.println("Піраміда у звичайному:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }

        // Виведення масиву у зворотньому
        System.out.println("Піраміда у зворотньому:");
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
