package by.itacademy.taxopark.utils;

import by.itacademy.taxopark.entities.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class CarBuilder {
    public List<Car> createCars(String fileAddress) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileAddress));
        List<Car> cars = new ArrayList<>();

        Map<String, Integer> carValueMap = new HashMap<>();
        if (reader.ready()) {
            String[] carValues = reader.readLine().split(";");
            int counter = 0;
            for (String value : carValues) {
                carValueMap.put(value, counter++);
            }
        } else {
            return cars;
        }

        while (reader.ready()) {
            String[] carValues = reader.readLine().split(";");

            double maxCarryingWeight = Double.parseDouble(carValues[carValueMap.get("maxCarryingWeight")]);
            int maxPassengers = Integer.parseInt(carValues[carValueMap.get("maxPassengers")]);
            int doors = Integer.parseInt(carValues[carValueMap.get("doors")]);
            double velocity = Double.parseDouble(carValues[carValueMap.get("velocity")]);
            double fuelConsumption = Double.parseDouble(carValues[carValueMap.get("fuelConsumption")]);
            String carID = carValues[carValueMap.get("carID")];
            String model = carValues[carValueMap.get("model")];
            String brand = carValues[carValueMap.get("brand")];

            Car currentCar;
            double carPrice;

            if (maxCarryingWeight > 1400) {
                if (maxPassengers > 20) {
                    currentCar = new TransporterCar(brand, model, carID,
                            fuelConsumption, velocity, maxCarryingWeight, maxPassengers);

                } else {
                    currentCar = new CarrierCar(brand, model, carID,
                            fuelConsumption, velocity, maxCarryingWeight, maxPassengers);
                }
                carPrice = 30000 + Math.random() * 10000;

            } else {
                if (maxPassengers >= 7) {
                    currentCar = new UniversalCar(brand, model, carID,
                            fuelConsumption, velocity, maxCarryingWeight, maxPassengers);
                    carPrice = 12500 + Math.random() * 5000;


                } else {
                    if (doors == 4) {
                        currentCar = new SedanCar(brand, model, carID,
                                fuelConsumption, velocity, maxCarryingWeight, maxPassengers);
                    } else {
                        currentCar = new HatchbackCar(brand, model, carID,
                                fuelConsumption, velocity, maxCarryingWeight, maxPassengers);
                    }
                    carPrice = 9000 + Math.random() * 5000;


                }
            }

            currentCar.setLocation("Minsk");
            currentCar.setPrice(Math.round(carPrice * 100) / 100.0);
            cars.add(currentCar);
        }


        return cars;
    }
}

