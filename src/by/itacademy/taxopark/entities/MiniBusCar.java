package by.itacademy.taxopark.entities;


public abstract class MiniBusCar extends Car {

    public MiniBusCar(String brand, String model, String carID, double fuelConsumption, double velocity, double maxCarryingWeight, int maxPassengers) {
        super(brand, model, carID, fuelConsumption, velocity, maxCarryingWeight, maxPassengers);
        doors = 4;
    }
}
