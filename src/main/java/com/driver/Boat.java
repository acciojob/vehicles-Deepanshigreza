package com.driver;

public class Boat implements WaterVehicle {
    String name;
    int capacity;
    @Override
    public String getVehicleName() {
        return "Name is "+name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity ;
    }
}
