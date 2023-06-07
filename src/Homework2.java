import javax.imageio.IIOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Homework2 hw2 = new Homework2();
        // Задание 1
        hw2.inputFloat();
        // Задание 2
        int [] array = new int [] {3, 5, 8, 1, 4, 5, 8, 10};
        hw2.task2(array);
        // Задание №3
        hw2.task3();
        // Задание №4
        hw2.task4();
    }
    // Задача 1
    public float inputFloat () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число");
        float num = 0;
        try {
            num = scanner.nextFloat();
            return num;
        } catch (InputMismatchException e) {
            System.err.println("Введен неверный формат");
        }
        inputFloat();
        return num;
    }
    // Задача 2
    public void task2 (int [] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e) {
            // дополнил этой строчкой, так как делитель может и не сущестовать с таким элементом.
            System.err.println("Index of IntArray is more, then array length - "  + intArray.length);
        }
        catch (ArithmeticException e) {
            System.err.println("Catching exception: " + e);
        }
    }


    // Задание 3
    public  void task3() { // Убрал  throws FileNotFoundException
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
            // Так-то работало и без этого исключения, так как примитивный тип int он не даёт привести к null.
        }catch (NullPointerException ex) {
            System.err.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Массив выходит за пределы своего размера!");
            // поменял последовательность исключений
        } catch (RuntimeException ex) {
            // Заменил Throwable на Runtime...
            System.err.println("Что-то пошло не так...");
        }
    }
    // для первого исключения присвоил a;
    public void printSum(Integer a, Integer b) {
        a = null;
        System.out.println(a + b);
    }

    // Задача №4

    public String task4 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you a String...");
        String someStr = scanner.nextLine();
        while (someStr.isEmpty()) {
            System.err.println("Empty lines cannot be entered");
            someStr = scanner.nextLine();
        }
        return someStr;
    }


}
