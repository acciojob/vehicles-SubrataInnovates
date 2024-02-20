package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for currentSpeed
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    // Getter method for currentDirection
    public int getCurrentDirection() {
        return currentDirection;
    }

    public void steer(int direction) {
        currentDirection += direction;
        System.out.println("Steering the vehicle. New direction: " + currentDirection);
    }

    public void move(int speed, int direction) {
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Moving the vehicle. Speed: " + currentSpeed + ", Direction: " + currentDirection);
    }

    public void stop() {
        currentSpeed = 0;
        System.out.println("Vehicle stopped.");
    }
}
