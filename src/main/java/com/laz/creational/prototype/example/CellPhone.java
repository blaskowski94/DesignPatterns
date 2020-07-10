package com.laz.creational.prototype.example;

import com.laz.creational.prototype.Prototype;

public class CellPhone implements Prototype {

  String brand;
  String carrier;

  public CellPhone() {
    brand = "";
    carrier = "";
  }

  public CellPhone(CellPhone phone) {
    this.brand = phone.brand;
    this.carrier = phone.carrier;
  }

  @Override
  public CellPhone clone() {
    return new CellPhone(this);
  }
}
