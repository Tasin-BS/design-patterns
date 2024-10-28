package com.java.designpatterns.builderpatterns.example.builders;

import com.java.designpatterns.builderpatterns.example.cars.CarType;
import com.java.designpatterns.builderpatterns.example.components.Engine;
import com.java.designpatterns.builderpatterns.example.components.GPSNavigator;
import com.java.designpatterns.builderpatterns.example.components.Transmission;
import com.java.designpatterns.builderpatterns.example.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
