package by.itacademy.taxopark.file_utils;

import by.itacademy.taxopark.entities.Car;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileDeserializeUtil {
    public synchronized static void derializableCar(String fileAddress) throws IOException {

        ArrayList<Car> newCars = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileAddress))) {
            newCars = ((ArrayList<Car>) ois.readObject());
        } catch (ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
        }
        for (Car car : newCars)
            System.out.print(car.toString() + "\n");

    }
}


