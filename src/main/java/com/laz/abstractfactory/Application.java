package com.laz.abstractfactory;

import com.laz.abstractfactory.buttons.Button;
import com.laz.abstractfactory.checkboxes.Checkbox;

/*
Client code that uses the abstract factory to create a button and checkbox, does not care about
implementation of factory, uses interface.
*/
public class Application {
  private final Button button;
  private final Checkbox checkbox;

  public Application(GUIFactory factory) {
    button = factory.createButton();
    checkbox = factory.createCheckbox();
  }

  public void paint() {
    button.render();
    checkbox.render();
  }
}
