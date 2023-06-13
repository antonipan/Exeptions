package Homework3;

public class EmptyStringException extends Exception {
    public EmptyStringException (String str) {
        super("Вы ввели пустое значение. Повторите ввод заново");
    }
}
