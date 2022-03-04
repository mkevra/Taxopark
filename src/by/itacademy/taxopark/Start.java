package by.itacademy.taxopark;

import by.itacademy.taxopark.entities.Car;
import by.itacademy.taxopark.exceptions.CarException;
import by.itacademy.taxopark.file_utils.FileDeserializeUtil;
import by.itacademy.taxopark.file_utils.FileSerializeUtil;
import by.itacademy.taxopark.menu.Menu;
import by.itacademy.taxopark.utils.Taxopark;
import by.itacademy.taxopark.utils.Train;


import java.io.IOException;
import java.util.ArrayList;


public class Start {


    public static void main(String[] args) throws IOException, CarException {
        ArrayList<Car> cars = new ArrayList<>();
        Taxopark taxopark = new Taxopark("D:\\Project/cars.csv");
        Menu.startFileWriteUtil();
        Menu.openMainMenu(taxopark);
        FileSerializeUtil.serializableCar(cars, "cars.out");
        FileDeserializeUtil.derializableCar("cars.out");


        FileSerializeUtil fileSerializeUtil = new FileSerializeUtil();
        Train train1 = new Train(fileSerializeUtil, cars, "cars.out");
        Train train2 = new Train(fileSerializeUtil, cars, "cars.out");
        train1.start();
        train2.start();
    }
}





