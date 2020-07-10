package com.laz.builder;

import com.laz.builder.components.Engine;
import com.laz.builder.components.GPSNavigator;
import com.laz.builder.components.Transmission;
import com.laz.builder.components.TripComputer;
import com.laz.builder.products.Type;

/*
Abstract builder interface
*/
public interface Builder {
  Builder setType(Type type);

  Builder setSeats(int seats);

  Builder setEngine(Engine engine);

  Builder setTransmission(Transmission transmission);

  Builder setTripComputer(TripComputer tripComputer);

  Builder setGPSNavigator(GPSNavigator gpsNavigator);
}
