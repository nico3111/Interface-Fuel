package com.company;

public interface IGasStation {

    public void fuelType(FuelType fuelType);
    boolean hasFuelType(FuelType fuelType);
    City getLocation();
    void goFuel();
}