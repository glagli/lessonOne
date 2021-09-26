/*

1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;

2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 Определить элементы одной из диагоналей можно по следующему принципу:
 индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

5. Написать метод, принимающий на вход два аргумента: len и initialValue,
и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.

**Примеры:
checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

8. *** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один влево) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два вправо) -> [ 6, 1, 3, 5 ].
При каком n в какую сторону сдвиг можете выбирать сами.

*/

public class HomeWorkLesson3 {

    public static void main(String[] args) {
        int[] arrTask7 = {1, 1, 1, 2, 1};
        int[] arrTask8 = {1, 2, 3, 4, 5, 6, 7};
        swap();
        arrayHundred();
        arraySearchEdit();
        arraySquare();
        arrayManual(7, 0);
        arrayMinMax();
        arrayTask7(arrTask7);
        arrayTask8(arrTask8, -3);
    }

    /// Задача 1
    private static void swap() {
        System.out.println("Задание №1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Исх. массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("\n" + "Изм. массив: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /// Задача 2
    public static void arrayHundred() {

        System.out.println("\n" + "\n" + "Задание №2");
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /// Задача 3
    public static void arraySearchEdit() {
        System.out.println("\n" + "\n" + "Задание №3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9};

        System.out.print("Исх. массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.print("\n" + "Изм. массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /// Задача 4
    public static void arraySquare() {
        System.out.println("\n" + "\n" + "Задание №4");
        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > 0; j--) {
                if (i + j == 5) {
                    arr[i][j - 1] = 1;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    /// Задача 5
    public static void arrayManual(int len, int initialValue) {
        System.out.println("\n" + "Задание №5");
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /// Задача 6
    public static void arrayMinMax() {
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        System.out.println("\n" + "\n" + "Задание №6");
        int[] arr = {2, 44, 3, 2, 11, -4, 53, 2, 4, 8, 95, 3};

        System.out.print("Исх. массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            } else if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        System.out.print("\n" + "Минимальный элемент: " + minNumber);
        System.out.print("\n" + "Максимальный элемент: " + maxNumber);
    }

    /// Задача 7
    public static void arrayTask7(int[] arr) {

        System.out.println("\n" + "\n" + "Задание №7");

        int borderLeft = arr.length / 2;
        int borderRight = arr.length / 2;
        int count = 0;
        boolean flag = false;

        while (count != arr.length / 2) {
            int sumLeft = 0;
            int sumRight = 0;
            if (count == arr.length / 2) {
                System.out.println(false);
            }

            for (int i = 0; i < borderLeft; i++) {
                sumLeft += arr[i];
            }
            // System.out.println(sumLeft);

            for (int i = arr.length; i > borderRight; i--) {
                sumRight += arr[i - 1];
            }
            // System.out.println(sumRight);

            if (sumLeft < sumRight) {
                borderLeft += 1;
                borderRight += 1;
                count += 1;
                continue;
            }
            if (sumLeft > sumRight) {
                borderRight -= 1;
                borderLeft -= 1;
                count += 1;
                continue;
            } else {
                flag = true;
                break;
            }

        }
        System.out.println(flag);
    }

    /// Задача 8
    public static void arrayTask8(int[] arr, int n) {
        System.out.println("\n" + "Задание №8");

        System.out.print("Исх. массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n" + "Смщ. массив: ");
        if (n > 0) {
            for (int i = n; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else if (n < 0) {
            for (int i = arr.length - (n * -1); i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < arr.length - ((n * -1)); i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
