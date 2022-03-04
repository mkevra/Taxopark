package by.itacademy.taxopark.file_utils;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteUtil {
    public static void writeMainMenu() {
        String mainMenu = "========================\n" +
                "Добро пожаловать!\n" +
                "========================\n" +
                "1. Подсчитать стоимость автопарка.\n" +
                "2. Провести сортировку автомобилей парка по расходу топлива.\n" +
                "3. Найти автомобиль компании, соответствующий заданному диапазону параметров скорости.\n" +
                "4. Для выхода из приложения.\n" +
                "========================";
        try (FileWriter mainMenuWriter = new FileWriter("MainMenu.txt")) {
            mainMenuWriter.write(mainMenu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
