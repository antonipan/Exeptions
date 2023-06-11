package Homework3;

public class UnCorrectDateFormat extends Exception {
    public UnCorrectDateFormat (String str) {
        super("Введён неверный формат даты. Нужно ввести дд/мм/гггг, а вы ввели: " + str);
    }
}