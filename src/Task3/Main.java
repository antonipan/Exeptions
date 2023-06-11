package Task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) {
//        System.out.println(divide(5, 0));
        String name = "Vasil";
        try {
            foo();
        } catch (NonExistedFileException e) {
            throw new RuntimeException(e.getMessage() + name);
        }

    }

    public static double divide (int a, int b) {
        double result = 0;
        try {
            result =  a / b;
        } catch (RuntimeException e) { // Только исключения стандартные
            throw new DivideByZeroExсeption(); // Созданное разработчиком исключение прописывается явно здесь.
        }
        return result;
    }

    public static void foo () throws NonExistedFileException{
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("afsfasfad"));
        } catch (FileNotFoundException e) {
            throw new NonExistedFileException();
        }
    }
}
