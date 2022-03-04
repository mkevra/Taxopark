package by.itacademy.taxopark.utils;

import by.itacademy.taxopark.entities.Car;
import by.itacademy.taxopark.exceptions.CarException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Taxopark {
    private List<Car> carPool;
    String fileAddress;

    public Taxopark(String fileAddress) throws IOException {
        this.carPool = new CarBuilder().createCars(fileAddress);

        this.fileAddress = fileAddress;
    }

    public double calculateTaxoparkCost() {
        double costTaxopark = 0.0;
        for (Car car : carPool) {
            costTaxopark = costTaxopark + car.getPrice();
        }
        System.out.println("Стоимость машин в парке: " + costTaxopark);
        return costTaxopark;
    }

    public void sortCarsByFuelConsumption() {
        carPool.sort((car1, car2) -> ((int) Math.round(100.0 * (car1.getFuelConsumption() - car2.getFuelConsumption()))));

        for (Car car : carPool) {
            System.out.printf("FuelConsumption of %s: %s", car, car.getFuelConsumption());

            System.out.println();
        }
    }

    public void carSearch() throws IOException, CarException {
        System.out.println("\n Найдите автомобили отвечающие Вашим критериям скорости");

        System.out.println("Какой должна быть минимальная скорость автомобиля? (разделитель - .)");
        double minVelocity = getVelocity();


        System.out.println("Какое значение не должна превышать максимальная скорость автомобиля? (разделитель - .)");
        double maxVelocity = getVelocity();

        while (maxVelocity < minVelocity) {
            System.out.println("Указанное Вами значение меньше минимальной, \n" +
                    "укажите другое");
            maxVelocity = getVelocity();
        }

        for (Car car : carPool) {
            if (car.getVelocity() >= minVelocity && car.getVelocity() <= maxVelocity) {
                System.out.printf("Speed of %s: %s", car, car.getVelocity());
                System.out.println();
            }


        }
    }

    private static double getVelocity() throws IOException {
        double currentVelocity;

        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                currentVelocity = Double.parseDouble(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите число (разделитель - .)");
            }
        }
        return currentVelocity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Taxopark)) return false;
        Taxopark taxopark = (Taxopark) o;
        return getCarPool().equals(taxopark.getCarPool()) && getFileAddress().equals(taxopark.getFileAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarPool(), getFileAddress());
    }

    @Override
    public String toString() {
        return "Taxopark{" +
                "carPool=" + carPool +
                ", fileAddress='" + fileAddress + '\'' +
                '}';
    }

    public List<Car> getCarPool() {
        return carPool;
    }

    public void setCarPool(List<Car> carPool) {
        this.carPool = carPool;
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }
}






