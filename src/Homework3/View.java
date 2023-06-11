package Homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    Human human;

    public Human inputUsersData () {
        Scanner scanner = new Scanner(System.in);
        human = new Human();
        String [] data_array = new String[] {"Фамилию", "Имя", "Отчество",
        "дату рождения в формате дд.мм.гггг", "Номер телефона без пробелов и символов", "пол - одной буквой - m or f"};
        for (int i = 0; i < data_array.length; i++) {
            System.out.println("Введите свои данные: " + data_array[i]);
            String some = scanner.nextLine();
            try {
                inputIsEmpty(some);
                human.setterHuman(some, i);
            } catch (EmptyStringException | UnCorrectDateFormat e) {
                System.err.println(e.getMessage());
            }

        }
        System.out.println(human.toString());
        return human;
    }

    //
    private static String inputIsEmpty (String some) throws EmptyStringException {
        if (some == null || some.isEmpty()) {
            throw new EmptyStringException(some);
        } else {
            return some;
        }
    }

}
