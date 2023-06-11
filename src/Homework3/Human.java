package Homework3;

import javax.lang.model.element.NestingKind;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;

public class Human {


    private String name;
    private String surname;
    private String patronymic;
    private String birthday;
    private String phone;
    private String sex;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public void setterHuman (String some, int i) throws UnCorrectDateFormat {
        switch (i) {
            case 0:
                setSurname(some);
            case 1:
                setName(some);
            case 2:
                setPatronymic(some);
            case 3:
                setBirthday(some);
            case 4:
                setPhone(some);
            case 5:
                setSex(some);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthday(String birthday) throws UnCorrectDateFormat {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date startDate;
        String newDateFormat;
        try {
            startDate = df.parse(birthday);
            newDateFormat = df.format(startDate);
            this.birthday = newDateFormat;
        } catch (ParseException e) {
            throw new UnCorrectDateFormat(birthday);
        }
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic + " " +
                birthday + " " + phone + " " + sex;
    }
}
