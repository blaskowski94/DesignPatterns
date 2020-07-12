package com.laz.creational.singleton;

public final class Singleton {
  // instance is static
  private static Singleton instance;
  public String value;

  // private constructor
  private Singleton(String value) {
    this.value = value;
  }

  // static getInstance method checks if instance already exists
  public static Singleton getInstance(String value) {
    if (instance == null) {
      instance = new Singleton(value);
    }
    return instance;
  }

}
