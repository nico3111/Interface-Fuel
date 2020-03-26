package com.company;

import java.util.Scanner;

public class City { //city

    IGasStation[] gasStations = new IGasStation[4];
    String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public void addGasStation(IGasStation gasStation) {
        for (int i = 0; i < gasStations.length; i++) {
            gasStations[i] = gasStation;
        }

    }

    public void whereGoRefuel() {
        String getgas;
        System.out.println("Was möchten sie tanken?\nSuper95, Diesel, Gas oder Strom?");
        Scanner userInput = new Scanner(System.in);
        getgas = userInput.nextLine();
        if (getgas.endsWith("5")) {
            System.out.println("Die Tankstelle hat Super95");
        } else if (getgas.startsWith("D")) {
            System.out.println("Die Tankstelle hat Diesel");
        } else if (getgas.startsWith("G")) {
            System.out.println("Die Tankstelle hat Gas");
        } else if (getgas.startsWith("S")) {
            System.out.println("Die Tankstelle hat Strom");
        }
    }
}
