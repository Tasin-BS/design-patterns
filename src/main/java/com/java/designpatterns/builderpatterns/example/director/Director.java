package com.java.designpatterns.builderpatterns.example.director;

import com.java.designpatterns.builderpatterns.example.builders.Builder;
import com.java.designpatterns.builderpatterns.example.cars.CarType;
import com.java.designpatterns.builderpatterns.example.components.Engine;
import com.java.designpatterns.builderpatterns.example.components.GPSNavigator;
import com.java.designpatterns.builderpatterns.example.components.Transmission;
import com.java.designpatterns.builderpatterns.example.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
