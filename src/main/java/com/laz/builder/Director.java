package com.laz.builder;

import com.laz.builder.components.Engine;
import com.laz.builder.components.GPSNavigator;
import com.laz.builder.components.Transmission;
import com.laz.builder.components.TripComputer;
import com.laz.builder.products.Type;

/*
  Enable easy construction of specific common configurations. Note that we can pass any type of
  builder here that implements builder interface.
*/
public class Director {

  public void constructSportsCar(Builder builder) {
    builder
        .setType(Type.SPORTS_CAR)
        .setSeats(2)
        .setEngine(new Engine(3.0, 0))
        .setTransmission(Transmission.SEMI_AUTOMATIC)
        .setTripComputer(new TripComputer())
        .setGPSNavigator(new GPSNavigator());
  }

  public void constructCityCar(Builder builder) {
    builder
        .setType(Type.CITY_CAR)
        .setSeats(2)
        .setEngine(new Engine(1.2, 0))
        .setTransmission(Transmission.AUTOMATIC)
        .setTripComputer(new TripComputer())
        .setGPSNavigator(new GPSNavigator());
  }

  public void constructSUV(Builder builder) {
    builder
        .setType(Type.SUV)
        .setSeats(4)
        .setEngine(new Engine(2.5, 0))
        .setTransmission(Transmission.MANUAL)
        .setGPSNavigator(new GPSNavigator());
  }
}
