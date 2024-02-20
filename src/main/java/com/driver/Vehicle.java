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

    public void steer(int direction){
        // Add direction to the current direction
        this.currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        // Set the current speed and direction
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        // Stop the vehicle by setting current speed to 0
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

    // Getter method for currentSpeed
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    // Getter method for currentDirection
    public int getCurrentDirection() {
        return currentDirection;
    }
}
