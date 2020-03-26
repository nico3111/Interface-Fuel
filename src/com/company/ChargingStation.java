package com.company;

public class ChargingStation implements IGasStation {
    City city;

    public ChargingStation(City city){
        this.city = city;
    }
    @Override
    public void fuelType(FuelType fuelType) {
    }

    @Override
    public boolean hasFuelType(FuelType fuelType) {
        return fuelType == FuelType.ELECTRIC;
    }

    @Override
    public City getLocation() {
        return city;
    }

    @Override
    public void goFuel() {
    }
}
