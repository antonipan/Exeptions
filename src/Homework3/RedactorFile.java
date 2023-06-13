package Homework3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class RedactorFile {


    public void writerFile (String str, Human human) {
        File file = new File(human.getSurname() + ".txt");
        if (file.exists()) {
            try (FileWriter writer = new FileWriter(file, true)) {
                writer.write(str);
                System.out.println("Файл успешно дозаписался. ");
            } catch (IOException e) {
                throw new RuntimeException(e + ". Что-то пошло не так. Попробуйте снова. ");

            }
        } else {
            try (FileWriter writer = new FileWriter(file, false)) {
                writer.write(str);
                System.out.println("Файл успешно записался. ");
            } catch (IOException e) {
                throw new RuntimeException("Что-то пошло не так. Попробуйте снова.");
            }
        }
    }

}
