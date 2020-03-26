package com.company;

public class PetrolCan implements IGasStation {

    String name;
    FuelType fuelType;
    City city;
    public PetrolCan(String name, FuelType diesel, City city){
        this.fuelType = fuelType;
        this.city = city;
        this.name = name;
    }
    @Override
    public void fuelType(FuelType fuelType) {
    }

    @Override
    public boolean hasFuelType(FuelType fuelType) {
        return fuelType == fuelType;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public City getLocation() {
        return city;
    }

    @Override
    public void goFuel() {
    }
}
