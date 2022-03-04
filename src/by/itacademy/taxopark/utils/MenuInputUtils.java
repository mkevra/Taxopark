package by.itacademy.taxopark.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuInputUtils {

        public static int getMenuChoice() {
            try {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Допускается ввод только положительных чисел. Попробуйте снова. ");
            }
            return getMenuChoice();
        }
    }

