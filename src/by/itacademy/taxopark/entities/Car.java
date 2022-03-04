package by.itacademy.taxopark.entities;

import java.io.Serializable;
import java.util.Objects;

public abstract class Car implements Serializable {
    protected String brand;
    protected String model;
    protected String carID;
    protected String location;

    protected double fuelConsumption;
    protected double price;
    protected double velocity;
    protected double maxCarryingWeight;

    protected boolean isLightsOn = false;

    protected int doors;
    protected int maxPassengers;

    public Car(String brand, String model, String carID, double fuelConsumption, double velocity, double maxCarryingWeight, int maxPassengers) {
        this.brand = brand;
        this.model = model;
        this.carID = carID;
        this.fuelConsumption = fuelConsumption;
        this.velocity = velocity;
        this.maxCarryingWeight = maxCarryingWeight;
        this.maxPassengers = maxPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getFuelConsumption(), getFuelConsumption()) == 0 && Double.compare(car.getPrice(), getPrice()) == 0 && Double.compare(car.getVelocity(), getVelocity()) == 0 && Double.compare(car.getMaxCarryingWeight(), getMaxCarryingWeight()) == 0 && isLightsOn() == car.isLightsOn() && getDoors() == car.getDoors() && getMaxPassengers() == car.getMaxPassengers() && getBrand().equals(car.getBrand()) && getModel().equals(car.getModel()) && getCarID().equals(car.getCarID()) && getLocation().equals(car.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getCarID(), getLocation(), getFuelConsumption(), getPrice(), getVelocity(), getMaxCarryingWeight(), isLightsOn(), getDoors(), getMaxPassengers());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carID='" + carID + '\'' +
                ", location='" + location + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", velocity=" + velocity +
                ", maxCarryingWeight=" + maxCarryingWeight +
                ", isLightsOn=" + isLightsOn +
                ", doors=" + doors +
                ", maxPassengers=" + maxPassengers +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getMaxCarryingWeight() {
        return maxCarryingWeight;
    }

    public void setMaxCarryingWeight(double maxCarryingWeight) {
        this.maxCarryingWeight = maxCarryingWeight;
    }

    public boolean isLightsOn() {
        return isLightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        isLightsOn = lightsOn;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    void move(String destination) {
        System.out.printf("%s has moved from %s to %s", carID, location, destination);
        System.out.println();
        location = destination;
    }

    void lightsOn() {
        isLightsOn = true;
    }

    void lightsOff() {
        isLightsOn = false;
    }

    void beep() {
        System.out.println("Beee-e-ep!!!");
    }

    double takeParcels(double parcelWeight) {
        if (parcelWeight <= maxCarryingWeight) {
            return 0;
        } else {
            return parcelWeight - maxCarryingWeight;
        }
    }

    int takePassengers(int passengersQty) {
        if (passengersQty <= maxPassengers) {
            return 0;
        } else {
            return passengersQty - maxPassengers;
        }
    }
}