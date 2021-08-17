package Homework2;

public class Homework2 {

    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
        doTask4();
        doTask5max();
        doTask5min();

    }

    /**
     * Задание 1
     * <p>
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    static void doTask1() {
        System.out.println("  ЗАДАНИЕ №1 ");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else
                arr[i] = 0;
            System.out.println(arr[i]);
        }
    }

    /**
     * Задание 2
     * <p>
     * Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */

    static void doTask2() {

        System.out.println("  ЗАДАНИЕ №2 ");

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                arr[i] = 0;
            } else
                arr[i] = i * 3;
            System.out.println(arr[i]);
        }

    }

    /**
     * Задание 3
     * <p>
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */

    static void doTask3() {
        System.out.println("  ЗАДАНИЕ №3 ");

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < 12; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            } else arr[i] = arr[i];
            System.out.println(arr[i]);
        }
    }

    /**
     * Задание 4
     * <p>
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */

    static void doTask4() {

        System.out.println("  ЗАДАНИЕ №4 ");
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    matrix[i][j] = 1;
                } else matrix[i][j] = 0;

                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * Задание 5**
     * <p>
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */

    static void doTask5max() {

        System.out.println("  ЗАДАНИЕ №5** ");

        int[] arr = {250, 560, 3, 4, 5, 6, 950, 8, 9, 17, 116};

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= arr[i]) {
                arr[i] = arr[i - 1];
            }
        }
        System.out.println("Максимальный элемент: " + (arr[arr.length - 1]));

    }
    static void doTask5min() {

        int[] arr = {250, 560, 3, 4, 5, 6, 950, 8, 9, 17, 116};

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] <= arr[i]) {
                arr[i] = arr[i - 1];
            }
        }
        System.out.println("Минимальный элемент: " + (arr[arr.length - 1]));
    }
}