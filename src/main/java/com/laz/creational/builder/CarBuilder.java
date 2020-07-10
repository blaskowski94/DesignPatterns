package com.laz.creational.builder;

import com.laz.creational.builder.components.Engine;
import com.laz.creational.builder.components.GPSNavigator;
import com.laz.creational.builder.components.Transmission;
import com.laz.creational.builder.components.TripComputer;
import com.laz.creational.builder.products.Car;
import com.laz.creational.builder.products.Type;

/*
Concrete implementation of builder interface to construct a car
*/
public class CarBuilder implements Builder {
  private Engine engine;
  private GPSNavigator gpsNavigator;
  private int seats;
  private Transmission transmission;
  private TripComputer tripComputer;
  private Type type;

  @Override
  public CarBuilder setType(Type type) {
    this.type = type;
    return this;
  }

  @Override
  public CarBuilder setSeats(int seats) {
    this.seats = seats;
    return this;
  }

  @Override
  public CarBuilder setEngine(Engine engine) {
    this.engine = engine;
    return this;
  }

  @Override
  public CarBuilder setTransmission(Transmission transmission) {
    this.transmission = transmission;
    return this;
  }

  @Override
  public CarBuilder setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
    return this;
  }

  @Override
  public CarBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
    return this;
  }

  public Car getResult() {
    return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
  }
}
