package by.itacademy.taxopark.utils;

import by.itacademy.taxopark.entities.Car;
import by.itacademy.taxopark.file_utils.FileSerializeUtil;

import java.util.ArrayList;

public class Train extends Thread {
    FileSerializeUtil fileSerializeUtil;
    ArrayList<Car> cars;
    String fileAddress;

    public Train(FileSerializeUtil fileSerializeUtil, ArrayList<Car> cars, String fileAddress) {
        this.fileSerializeUtil = fileSerializeUtil;
        this.cars = cars;
        this.fileAddress = fileAddress;
    }

    @Override

    public void run() {

        FileSerializeUtil.serializableCar(cars, fileAddress);

    }
}

