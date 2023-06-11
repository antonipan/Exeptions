import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Seminar3 {
    public static void main(String[] args) {
//        Seminar3 sn3 = new Seminar3();
//        try {
//            sn3.doSomething();
//        } catch (Exception e) {
//            System.out.println("Crash");
//            throw new RuntimeException(e);
//        }

        Task4 task4 = new Task4();

        try {
            System.out.println(task4.sum2d(task4.arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }



        try (Counter counter = new Counter()){
            System.out.println(counter.getA());
            counter.add();
            System.out.println(counter.getA());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Counter counter = new Counter();
        System.out.println(counter.getA());
        try {
            counter.add();
            System.out.println(counter.getA());
            counter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    public static void rwLine(Path pathRead, Path pathWrite) {
        try (BufferedReader in = Files.newBufferedReader(pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite)){
            out.write(in.readLine());
        } // тут можно прописать кетч, но тогда нужно убрать троуз.
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // task1
    /**
     Создайте метод doSomething(), который может быть источником одного
     из типов checked exceptions(тело самого метода прописывать не обязательно).
     Вызовите этот метод из main и обработайте в нем исключение, которое вызвал
     метод doSomething().
     */
    public void doSomething () throws Exception {
        System.out.println("I do something...");
        throw new Exception("Bla-bla-bla");
    }

}

/**
 Напишите метод, на вход которого подаётся двумерный строковый массив размером 3х3.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

 1. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось
 (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException
 с детализацией, в какой именно ячейке лежат неверные данные.

 2. В методе main() вызвать полученный метод, обработать возможные исключения
 MyArraySizeException и MyArrayDataException и вывести результат расчета
 (сумму элементов, при условии, что подали на вход корректный массив).
 */
class Task4 {
    String[][] arr = new String[][] {
            {"1", "1.5", "1.5"},
            {"1", "1.5", "1.5"},
            {"1", "1.5", "1.5"}
    };

    public double sum2d(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (isNotSquare(arr, 3)) {
            throw new MyArraySizeException();
        }
        double summ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    summ += Double.parseDouble(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return summ;
    }

    private boolean isNotSquare (String [][] arr, int size) {
        if (arr.length != size) {
            return true;
        }
        for (String [] arr1: arr
             ) {
            if (arr1.length != size) {
                return true;
            }
        }
    return false;
    }
}

class MyArraySizeException extends Exception {

    public MyArraySizeException () {
        super("Массив должен быть 3х3. ");
    }
}

class MyArrayDataException extends Exception {

    public MyArrayDataException (int i, int j) {
        super(String.format("В ячейке [%d][%d] not содержится число", i, j));
    }
}
