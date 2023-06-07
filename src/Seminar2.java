import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Изучите данный код. Все ли с ним хорошо? Если нет,
 * скорректируйте код, попробуйте обосновать свое решение.
 */
public class Seminar2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(
                "Укажите индекс элемента массива, " +
                        "в который хотите записать значение 1");


        int index = 1;
        if (scanner.hasNextInt()) {
            index = scanner.nextInt();
        } else System.out.println("Введено нечисловое значение");
        try {
            arr[index] = 1;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Указан индекс за пределами массива");
        }
//        try {
//            int index = scanner.nextInt();
//            arr[index] = 1;
//        } catch (IndexOutOfBoundsException e) {
//            System.err.println("Указан индекс за пределами массива");
//        }
//        catch (InputMismatchException у) {
//            System.err.println("Введено неверное значение");
//        }
    }
}

/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */
class Task2 {
    public static void main(String[] args) {
        String[][] arr0 = new String[][] {
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };

        String[][] arr = new String[][] {
                {"ф", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "2"},
                {"3", "3"},
                {"2", "6"}
        };
        String [][] arr1 = null;


        System.out.println(sum2d(arr1));
    }

    private static int sum2d(String[][] arr) {
//        if (arr == null) {
//            throw new NullPointerException("Массив нулевой");
//        }
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("В массиве присутствуют не числа");
        } catch (NullPointerException e) {
            System.out.println("Массив не может быть найден");
        }
        System.out.println("Я всё равно выполнюсь");
        return sum;
    }
}

/**
 * Запишите в файл следующие строки:
 *
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Полина=?
 * Константин=?
 * Иван=4
 *
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
 * если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
 * если сохранено значение ?, заменить его на соответствующее число.Если на каком-то месте
 * встречается символ, отличный от числа или ?, бросить подходящее исключение.
 * Записать в тот же файл данные с замененными символами ?.
 */
class Task3 {

    public static void main(String[] args) {

    }
}