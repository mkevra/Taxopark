package by.itacademy.taxopark.file_utils;

import by.itacademy.taxopark.entities.Car;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileSerializeUtil {
    public synchronized static void serializableCar(ArrayList<Car> cars, String fileAddress) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileAddress))) {
            oos.writeObject(cars);
            System.out.println("Объекты сохранены в Файл!");

            for (int i = 0; i < 3; i++) {

                System.out.println(i);

            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
