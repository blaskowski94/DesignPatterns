package com.laz.builder;

import com.laz.builder.components.Engine;
import com.laz.builder.components.GPSNavigator;
import com.laz.builder.components.Transmission;
import com.laz.builder.components.TripComputer;
import com.laz.builder.products.Manual;
import com.laz.builder.products.Type;

/*
Concrete implementation of builder to construct a car manual
*/
public class ManualBuilder implements Builder {
  private Engine engine;
  private GPSNavigator gpsNavigator;
  private int seats;
  private Transmission transmission;
  private TripComputer tripComputer;
  private Type type;

  @Override
  public ManualBuilder setType(Type type) {
    this.type = type;
    return this;
  }

  @Override
  public ManualBuilder setSeats(int seats) {
    this.seats = seats;
    return this;
  }

  @Override
  public ManualBuilder setEngine(Engine engine) {
    this.engine = engine;
    return this;
  }

  @Override
  public ManualBuilder setTransmission(Transmission transmission) {
    this.transmission = transmission;
    return this;
  }

  @Override
  public ManualBuilder setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
    return this;
  }

  @Override
  public ManualBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
    return this;
  }

  public Manual getResult() {
    return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
  }
}
