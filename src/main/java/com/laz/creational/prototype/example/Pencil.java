package com.laz.creational.prototype.example;

import com.laz.creational.prototype.Prototype;

public class Pencil implements Prototype {

  double leadSize;
  String color;

  public Pencil() {
    leadSize = 0.0;
    color = "";
  }

  public Pencil(Pencil pencil) {
    this.leadSize = pencil.leadSize;
    this.color = pencil.color;
  }

  @Override
  public Pencil clone() {
    return new Pencil(this);
  }
}
