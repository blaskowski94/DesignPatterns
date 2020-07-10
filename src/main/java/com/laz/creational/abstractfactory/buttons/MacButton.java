package com.laz.creational.abstractfactory.buttons;

public class MacButton implements Button {

  @Override
  public void render() {
    System.out.println("Test Mac Button");
    onClick();
  }

  @Override
  public void onClick() {
    System.out.println("Click! Mac Button says - 'Hello  World!'");
  }
}
