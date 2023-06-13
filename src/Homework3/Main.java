package Homework3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Human human = new Human();
        view.inputUsersData(human);
        RedactorFile redactorFile = new RedactorFile();
        System.out.println(human.getSurname());
        redactorFile.writerFile(human.toString(), human);





    }

}
