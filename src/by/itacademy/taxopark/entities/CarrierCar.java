package by.itacademy.taxopark.entities;

import by.itacademy.taxopark.interfaces.BigParcelOrder;

public class CarrierCar extends MiniBusCar implements BigParcelOrder {

    public CarrierCar(String brand, String model, String carID, double fuelConsumption, double velocity, double maxCarryingWeight, int maxPassengers) {
        super(brand, model, carID, fuelConsumption, velocity, maxCarryingWeight, maxPassengers);
        this.brand = brand;
        this.model = model;
        this.carID = carID;
        this.fuelConsumption = fuelConsumption;
        this.velocity = velocity;
        this.maxCarryingWeight = maxCarryingWeight;
        this.maxPassengers = maxPassengers;
    }
}