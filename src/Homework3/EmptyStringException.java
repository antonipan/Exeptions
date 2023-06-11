package Homework3;

public class EmptyStringException extends Exception {
    public EmptyStringException (String str) {
        super("Введена пустая строка " + str);
    }
}
