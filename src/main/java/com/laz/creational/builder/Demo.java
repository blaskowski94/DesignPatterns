package com.laz.creational.builder;

import com.laz.creational.builder.components.Engine;
import com.laz.creational.builder.products.Car;
import com.laz.creational.builder.products.Manual;
import com.laz.creational.builder.products.Type;

public class Demo {

  public static void main(String[] args) {
    Director director = new Director();

    // Director gets the concrete builder object from the client
    // (application code). That's because application knows better which
    // builder to use to get a specific product.
    CarBuilder builder = new CarBuilder();
    director.constructSportsCar(builder);

    // The final product is often retrieved from a builder object, since
    // Director is not aware and not dependent on concrete builders and
    // products.
    Car car = builder.getResult();
    System.out.println("Car built:\n" + car.getType());

    ManualBuilder manualBuilder = new ManualBuilder();

    // Director may know several building recipes.
    director.constructSportsCar(manualBuilder);
    Manual carManual = manualBuilder.getResult();
    System.out.println("\nCar manual built:\n" + carManual.print());

    // use builders directly
    CarBuilder cBuilder = new CarBuilder();
    Car c = cBuilder.setSeats(5).setEngine(new Engine(3.0, 0)).setType(Type.SUV).getResult();
    System.out.println("Car built! " + c.getType());
  }
}
