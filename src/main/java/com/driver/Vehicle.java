package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public int getCurrentSpeed() {
        return currentSpeed=90;
    }

    public Vehicle(String name) {
        this.name=name;
        currentSpeed=0;
        currentDirection=0;

    }

    public Vehicle() {

    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        this.currentDirection=currentDirection+direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        currentSpeed=speed;
        currentDirection=direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }






    public void stop(){
        this.currentSpeed=0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}
