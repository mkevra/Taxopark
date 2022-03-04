package by.itacademy.taxopark.entities;

import java.io.Serializable;

public class SedanCar extends FamilyCar implements Serializable {

    public SedanCar(String brand, String model, String carID, double fuelConsumption, double velocity, double maxCarryingWeight, int maxPassengers) {
        super(brand, model, carID, fuelConsumption, velocity, maxCarryingWeight, maxPassengers);
        this.brand = brand;
        this.model = model;
        this.carID = carID;
        this.fuelConsumption = fuelConsumption;
        this.velocity = velocity;
        this.maxCarryingWeight = maxCarryingWeight;
        this.maxPassengers = 5;
        this.doors = 4;
    }
}


