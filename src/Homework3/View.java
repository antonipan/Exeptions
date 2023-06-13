package Homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {


    public Human inputUsersData (Human human) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свою фамилию: ");
        human.setSurname(scanner.nextLine());
        inputIsEmpty(human.getSurname());
        System.out.println("Введите своё имя: ");
        human.setName(scanner.nextLine());
        inputIsEmpty(human.getName());
        System.out.println("Введите своё отчество: ");
        human.setPatronymic(scanner.nextLine());
        inputIsEmpty(human.getPatronymic());
        System.out.println("Введите свою дату рождения в формате дд/мм/гггг: ");
        try {
            human.setBirthday(scanner.nextLine());
        } catch (UnCorrectDateFormat e) {
            System.err.println(e.getMessage());
        }
        inputIsEmpty(human.getBirthday());
        System.out.println("Введите свой Номер телефона без пробелов и символов: ");
        human.setPhone(scanner.nextLine());
        inputIsEmpty(human.getPhone());
        System.out.println("Введите свой пол - одной буквой - m or f ");
        human.setSex(scanner.nextLine());
        inputIsEmpty(human.getSex());

        return human;
    }

    //
    private static void inputIsEmpty (String some) {
        if (some == null || some.isEmpty()) {
            try {
                throw new EmptyStringException(some);
            } catch (EmptyStringException e) {
                System.err.println(e.getMessage());
                throw new NullPointerException();
            }
        }
    }


}
