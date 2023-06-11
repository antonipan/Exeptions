import java.util.Arrays;

public class Seminar1 {
    public static void main(String[] args) {
        // Задание 1

        // Задание 2.
        int [] array1 = new int [] {5, 5, 3, 2, 1, 0};
        int [] array2 = new int [] {3, 3, 0, 1, 1, 4};
        System.out.println(Arrays.toString(differenceOfArrays(array1, array2)));

        System.out.println(Arrays.toString(divideOfArrays(array1, array2)));

        // Задание 3




    }

    // Семинар 1. Задание 1.
    public static int sum2d(String[][] arr) { // может быть пустой массив или не массив вовсе.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) { // Здесь может быть выход за размре.
                int val = Integer.parseInt(arr[i][j]); // Здесь будет исключение, так как распарсить в число может и не получиться.
                sum += val;
            }
        }
        return sum;
    }

    // Семинар 1. Задание 2.
    public static int [] differenceOfArrays (int [] array1, int [] array2) {
        int [] arrayTotal = new int[array2.length];
        if (array1.length != array2.length) {
            throw new RuntimeException("Sizes of Arrays are different");
        } else {
            for (int i = 0; i < array1.length; i++) {
                arrayTotal[i] = array1[i] - array2[i];
            }
        }
        return arrayTotal;
    }

    // Семинар №1. Задание 3.
    public static int [] divideOfArrays (int [] array1, int [] array2) {
        int [] arrayTotal = new int[array2.length];
        if (array1.length != array2.length) {
            throw new RuntimeException("Sizes of Arrays are different");
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array2 [i] == 0) {
                    throw new RuntimeException("Divide by zero is not");
                }
                arrayTotal[i] = array1[i] - array2[i];
            }
        }
        return arrayTotal;
    }


}
