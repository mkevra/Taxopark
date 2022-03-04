package by.itacademy.taxopark.file_utils;

import java.io.FileReader;
import java.io.IOException;

public class FileReadUtil {
    public static void mainMenuReader() {
        try (FileReader fileReader = new FileReader("MainMenu.txt")) {
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

