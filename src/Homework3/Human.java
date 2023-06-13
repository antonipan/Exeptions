package Homework3;

import javax.lang.model.element.NestingKind;
import java.text.*;
import java.time.LocalDate;
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
        CharacterIterator it = new StringCharacterIterator(phone);
        String str = null;
        try {
            while (it.current() != CharacterIterator.DONE) {
                str = String.valueOf(it.current());
                int a = Integer.parseInt(str);
                it.next();
            }
            this.phone = phone;
        } catch (Exception e) {
            try {
                throw new ParseException("Мы не моежм преобразовать этот символ в число: " + str, it.getIndex());
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                this.phone = null;
            }
        }
    }

    public void setSex(String sex) {
        int a = sex.length();
        if (a != 1) {
            System.err.println("Пол введён некооректно. Запись отклонена. ");
            this.sex = null;
        } else {
            if (sex.equals("m") || sex.equals("f")) {
                this.sex = sex;
            } else {
                System.err.println("Пол введён некорректно.. ");
                this.sex = null;
            }
        }
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic + " " +
                birthday + " " + phone + " " + sex + "\n";
    }
}
