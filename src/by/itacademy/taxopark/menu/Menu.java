package by.itacademy.taxopark.menu;

import by.itacademy.taxopark.exceptions.CarException;
import by.itacademy.taxopark.file_utils.FileReadUtil;
import by.itacademy.taxopark.file_utils.FileWriteUtil;
import by.itacademy.taxopark.utils.MenuInputUtils;
import by.itacademy.taxopark.utils.Taxopark;

import java.io.IOException;


public class Menu {
    public static void startFileWriteUtil() {
        FileWriteUtil.writeMainMenu();
    }

    public static void openMainMenu(Taxopark taxopark) throws IOException, CarException {
        FileReadUtil.mainMenuReader();
        int choiceMainMenu = MenuInputUtils.getMenuChoice();
        switch (choiceMainMenu) {
            case 1:
                System.out.println("Стоимость таксопарка подсчитана: ");
                System.out.println("=======================================");
                taxopark.calculateTaxoparkCost();
                break;
            case 2:
                System.out.println("Сортировка автомобилей парка по расходу топлива завершена:  ");
                System.out.println("=======================================");
                taxopark.sortCarsByFuelConsumption();
                break;
            case 3:
                System.out.println("Автомобиль, соответствующий заданному диапазону скорости найден: ");
                System.out.println("=======================================");
                taxopark.carSearch();
                break;
            case 4:
                System.out.println("До новых встреч!");
                System.exit(0);
            default:
                System.out.println("Такого пункта в меню нет. Попробуйте ещё раз.");
                MenuInputUtils.getMenuChoice();
                break;
        }
        openMainMenu(taxopark);

    }

}




