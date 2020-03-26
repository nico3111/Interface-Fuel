package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fuelType;

        Agip agip = new Agip("Agip", new FuelType[]{FuelType.GAS}, new City("Lustenau"));

        Hofer hofer = new Hofer("Hofer", new FuelType[]{FuelType.ELECTRIC}, new City("Hohenems"));

        OMV omv = new OMV("OMV", new FuelType[]{FuelType.SUPER95, FuelType.DIESEL, FuelType.GAS}, new City("Dornbirn"));

        ChargingStation chargingStation = new ChargingStation(new City("Bregenz"));

        PetrolCan petrolCan = new PetrolCan("Benzinkanister", FuelType.DIESEL, new City("Höchst"));

        Car car = new Car(FuelType.DIESEL);

        IGasStation[] myGasStations = new IGasStation[10];
        myGasStations[0] = omv;
        myGasStations[1] = hofer;
        myGasStations[2] = agip;
        myGasStations[3] = petrolCan;

        System.out.println("Wo ist ihr Zielort?");

        Scanner input = new Scanner(System.in);
        String cityName = input.nextLine();

        for (IGasStation gasStation : myGasStations) {
            if (gasStation.hasFuelType(car.fuelType) && gasStation.getLocation() != null && gasStation.getLocation().cityName.equalsIgnoreCase(cityName)) {
                gasStation.goFuel();
                System.out.println("Die Tankstelle " + gasStation + " hat " + car.fuelType + " zum tanken!");
                break;
            }
        }
    }
}
