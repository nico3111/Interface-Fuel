package com.company;

public class OMV implements IGasStation {
    String name;
    FuelType[] fuelTypes;
    City city;
    public OMV(String name, FuelType[] fuelTypes, City city) {
        this.name = name;
        this.fuelTypes = fuelTypes;
        this.city = city;
    }
    @Override
    public void fuelType(FuelType fuelType) {
    }

    @Override
    public boolean hasFuelType(FuelType fuelType) {
        boolean hasMyFuel = false;

        for (FuelType singleFuelType:fuelTypes) {
            if(singleFuelType == fuelType) {
                hasMyFuel = true;
                break;
            }
        }

        return hasMyFuel;
    }

    @Override
    public City getLocation() {
        return city;
    }

    @Override
    public void goFuel() {
    }

    @Override
    public String toString() {
        return name;
    }
}
