package by.itacademy.taxopark.entities;

import by.itacademy.taxopark.interfaces.FamilyVacation;
import by.itacademy.taxopark.interfaces.SmallOrder;

public abstract class FamilyCar extends Car implements FamilyVacation, SmallOrder {

    public FamilyCar(String brand, String model, String carID, double fuelConsumption, double velocity, double maxCarryingWeight, int maxPassengers) {
        super(brand, model, carID, fuelConsumption, velocity, maxCarryingWeight, maxPassengers);
    }
}
