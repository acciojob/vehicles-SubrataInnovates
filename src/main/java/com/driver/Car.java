package com.driver;

public class Car extends Vehicle {

    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1;
    }

    public void changeGear(int newGear) {
        currentGear = newGear;
        System.out.println("Changed gear to " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        super.move(newSpeed, newDirection);
    }

    // Getter methods for Car-specific properties
    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isManual() {
        return isManual;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    // Getter method for currentGear
    public int getCurrentGear() {
        return currentGear;
    }
}
